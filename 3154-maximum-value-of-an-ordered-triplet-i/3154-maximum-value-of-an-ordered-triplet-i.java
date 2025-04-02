class Solution {
    public long maximumTripletValue(int[] nums) {
        long max=Long.MIN_VALUE;
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                 long b =(long)(nums[i]-nums[j])*nums[k];
                 max=Math.max(max,b);
                }
            }
        }
        return Math.max(0,max);
    }
}