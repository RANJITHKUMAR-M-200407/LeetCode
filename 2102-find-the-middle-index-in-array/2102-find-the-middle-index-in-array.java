class Solution {
    public int findMiddleIndex(int[] nums) {
        int[]right=new int[nums.length];
       int[]left = new int[nums.length];
       int sum=0;
       for(int i=0;i<nums.length;i++)
       {
        sum+=nums[i];
       }
       int leftn=0;
       for(int i=0;i<nums.length;i++)
       {
        leftn += nums[i];
        right[i]=sum-leftn;
       } 
       int rightn=0;
       for(int i=0;i<nums.length;i++)
       {
        left[i]=rightn;
        rightn+=nums[i];
       }
       for(int i=0;i<nums.length;i++)
       {
        if(right[i]==left[i])  return i;
       }
       return -1;
  
    }
}