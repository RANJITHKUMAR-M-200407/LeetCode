class Solution {
    public int differenceOfSum(int[] nums) {
        int ans=0;
        int sum=0;
       for(int i=0;i<nums.length;i++)
       {
        ans=ans+nums[i];
       }
       for(int i=0;i<nums.length;i++)
       {
        int sol=nums[i];
        while(sol!=0)
        {
         sum=sum+(sol%10);
         sol=sol/10;
        }
       }
       return Math.abs(ans-sum);
    }
}