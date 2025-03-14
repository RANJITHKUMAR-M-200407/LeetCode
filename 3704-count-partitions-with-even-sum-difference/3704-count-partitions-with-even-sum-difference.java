class Solution {
    public int countPartitions(int[] nums) {
       int sum=0;
       for(int i=0;i<nums.length;i++)
       {
        sum+=nums[i];
       } 
       int ans=0;
       int copy=sum;
       int count=0;
       for(int i=0;i<nums.length-1;i++)
       {
       sum=copy;
       ans+=nums[i];
       sum=sum-ans;
       if((int)Math.abs(sum-ans)%2==0)
       {
        count++;
       }
       }

       return count;
    }
}