class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        int count1=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]%3==1)
        {
        count++;
        }
        if(nums[i]%3==2)
        {
        count1++;
        }
       }   
       return count+count1;
    }
}