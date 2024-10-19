class Solution {
    public int[] runningSum(int[] nums) {
         int sum=0;
        
        int [] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
          int temp=nums[i];
        sum=sum+temp;
        ans[i]=sum;
        }
        return ans;
    }
}