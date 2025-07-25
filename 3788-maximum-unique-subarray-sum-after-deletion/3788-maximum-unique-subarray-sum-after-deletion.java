class Solution {
    public int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        if(max<0) return max;
        HashSet<Integer> set = new HashSet<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0 && !set.contains(nums[i])){
              sum+=nums[i];
              set.add(nums[i]);
            }
            else set.add(nums[i]);
        }
        return sum;
    }
}