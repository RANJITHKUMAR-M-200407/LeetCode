class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Integer.MIN_VALUE;
      for(int i=1;i<nums.length;i++)
      {
        int num=(int)(Math.abs(nums[i-1]-nums[i]));
        max = Integer.max(num,max);
      }
      int val = (int)(Math.abs(nums[nums.length-1]-nums[0]));
      max =  Integer.max(val,max);
      return max;
    }
}