class Solution {
    public int[] leftRightDifference(int[] nums) {
    int lsum=0; 
    int lsum1=0;   
    int rsum=0;
    int rsum1=0;
    int[]larr=new int[nums.length];
    int[]rarr=new int[nums.length];
    int[]ans=new int[nums.length];
     larr[0]=0;
     rarr[nums.length-1]=0;
    for(int i=0;i<nums.length-1;i++)
    {
    lsum=lsum+nums[i];
    larr[i+1]=lsum;
    }
for(int i=nums.length-1;i>0;i--)
    {
    rsum=rsum+nums[i];
    rarr[i-1]=rsum;
    }
    for(int i=0;i<larr.length;i++)
    {
      ans[i]=Math.abs(larr[i]-rarr[i]);  
    }
    return ans;
    }
}