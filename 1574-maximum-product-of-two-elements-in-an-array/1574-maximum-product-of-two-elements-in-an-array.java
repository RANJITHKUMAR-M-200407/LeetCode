class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
       int first=nums.length-1;
       int last=nums.length-2;
       return (nums[first]-1) * (nums[last]-1); 
    }
}