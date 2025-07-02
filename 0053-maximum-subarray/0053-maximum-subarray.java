class Solution {
    public int maxSubArray(int[] nums) {
    //     if(nums.length<2) return nums[0];
    //   int sum=0;
      int cur=0;
      int max =Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
        if(nums[i]>cur+nums[i])  cur=nums[i];
        else cur+=nums[i];
        max = Math.max(max,cur);
      }  
      return max;
    }
}