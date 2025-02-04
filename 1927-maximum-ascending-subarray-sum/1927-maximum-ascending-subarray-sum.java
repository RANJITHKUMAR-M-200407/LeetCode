class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
        int max=0;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
             sum=sum+nums[i+1];
            }
            else if(nums[i]>=nums[i+1])
            {
                if(sum>max) max=sum;
                sum=nums[i+1];
            }
        }
       
        return Math.max(sum,max);
    }
}