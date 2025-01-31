class Solution {
    public void moveZeroes(int[] nums) {
        int[]arr=new int[nums.length];
       int l=0;
       for(int i=0;i<=arr.length-1;i++)
       {
        if(nums[i]!=0)
        {
            arr[l]=nums[i];
            l++;
        }
    }
     for (int i = l; i < arr.length-1; i++) {
        arr[i]=0;
     } 
       for(int i = 0;i < arr.length;i++) nums[i] = arr[i];
    }
    
}