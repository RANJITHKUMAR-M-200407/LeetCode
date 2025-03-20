class Solution {
    public int findMin(int[] nums) {
        if(nums[nums.length-1]>nums[0]) return nums[0];
        int n = nums.length;
      for(int i=1;i<n-1;i++)
      {
      if(nums[i%n]<nums[(i+1)%n] && nums[(i-1)%n]>nums[i%n])  return nums[i];
      }  
      return nums[nums.length-1];
    }
}