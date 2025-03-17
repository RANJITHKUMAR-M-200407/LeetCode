class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        // int[]arr = new int[nums[nums.length-1]+1];
        int count =0;
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]==nums[i+1]){
                count++;
            }else{
                return false;
            }
        }
       
        if(count==nums.length/2) return true;
        else return false;
    }
}