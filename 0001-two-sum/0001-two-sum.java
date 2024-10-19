class Solution {
    static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=0;
        for (i = 0; i <= nums.length-1; i++) {
            for ( j = 0; j <=nums.length-1 ; j++) {
                if(nums[i]+nums[j]==target) {
                    if(i<j)
                    {
                        return new int[]{i,j};
                    }
                
                }
                }
            }
        return null;
    }
}