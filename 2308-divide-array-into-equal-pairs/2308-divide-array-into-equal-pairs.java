class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int[]arr = new int[nums[nums.length-1]+1];
        for(int i=0;i<nums.length;i++)
        {
            arr[(nums[i])]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0) return false;
        }
        return true;
    }
}