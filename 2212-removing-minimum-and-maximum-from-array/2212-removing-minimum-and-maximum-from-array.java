class Solution {
    public int minimumDeletions(int[] nums) {
      int min= Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++)
      {
        if(nums[i]>max) max = nums[i];
        if(min>nums[i]) min= nums[i];
      }  
      int c1=0,c2=0,c3=0;
      int val1=2,val2=2;
      for(int i=0;i<nums.length;i++)
      {
        c1++;
        if(nums[i]==max || nums[i]==min) val1--;
        if(val1<1) break; 
      }
       for(int i=nums.length-1;i>=0;i--)
      {
        c2++;
        if(nums[i]==max || nums[i]==min) val2--;
        if(val2<1) break; 
      }
        for(int i=0;i<nums.length;i++)
      {
        c3++;
        if(nums[i]==max || nums[i]==min) break;
      }
         for(int i=nums.length-1;i>=0;i--)
      {
        c3++;
        if(nums[i]==max || nums[i]==min) break; 
      }
 int res=Math.min(c1,Math.min(c2,c3));
      return res;
    }
}