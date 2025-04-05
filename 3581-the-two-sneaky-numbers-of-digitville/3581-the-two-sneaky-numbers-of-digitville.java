class Solution {
    public int[] getSneakyNumbers(int[] nums) {
         int k=0;
        int[] ans= new int[2];
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++)
       {
        if(nums[i]==nums[i+1])
        {
          ans[k]=nums[i];
          k++;
        }
       }
       return ans ;
    }
}