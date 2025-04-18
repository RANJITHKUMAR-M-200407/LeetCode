class Solution {
    public int repeatedNTimes(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       int n = nums.length/2;
       for(int i=0;i<nums.length;i++)
       {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }
       for(Map.Entry<Integer,Integer> entry : map.entrySet())
       {
        if(entry.getValue()==n)
        {
           return entry.getKey();  
        }
       }
      // System.out.print(map.getkey(n));
       return 0;
    }
}