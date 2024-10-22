class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
       int a=nums[0];
       int b=nums[nums.length-1];
       int k=0;
       int count=0;
       for(int i=a;i>=1;i--)
       {
        if(a%i==0 && b%i==0)
        {
          count= i;
        }
        if(count>k)
        {
           k=count;
        }
       }
      
        return k; 
    }
}