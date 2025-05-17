class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
      Arrays.sort(nums);
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]<0 && k>0)
        {
            nums[i]=nums[i]*(-1);
            k--;
        }  
        else break;
      } 
      Arrays.sort(nums);
      if(k>0)
      {
         for(int i=0;i<nums.length;i++)
      {
        if(k%2!=0)
        {
            nums[i]=nums[i]*(-1);
            k--;
        }  
        else break;
      } 
      } 
      int sum=0;
      for(int i=0;i<nums.length;i++)
      {
        sum+=nums[i];
      }
     // System.out.print(Arrays.toString(nums));
      return sum;
    }
}