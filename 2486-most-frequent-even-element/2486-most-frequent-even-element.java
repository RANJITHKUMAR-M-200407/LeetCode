class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
        if(nums[i]%2==0)  map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(map.size()<1) return -1;
    int max=Integer.MIN_VALUE;
    for(Map.Entry<Integer,Integer> entry : map.entrySet())
    {
        if(max<entry.getValue()) max = entry.getValue(); 
    } 
   // System.out.print(max); 
     int min=Integer.MAX_VALUE;
    for(Map.Entry<Integer,Integer> entry : map.entrySet())
    {
        if(max==entry.getValue()) 
        {
        min=Math.min(min,entry.getKey());
        }
    }

    //System.out.print(min);
return min;
    }
}