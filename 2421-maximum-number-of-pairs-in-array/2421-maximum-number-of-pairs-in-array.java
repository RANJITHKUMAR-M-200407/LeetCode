class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count1=0;
        int count2=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
        count1+=(entry.getValue()/2);
        if(entry.getValue()%2!=0)
        {
            count2++;
        }   

        }
      //  System.out.print(map); 
        int[]ans = new int[2];
        ans[0]=count1;
        ans[1]=count2;
  return ans;
    }
}