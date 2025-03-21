class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int st=0,e=0;
      int sum=0;
      int min=Integer.MAX_VALUE;
      while(e<nums.length)
      {
        sum=sum+nums[e];
       while(sum>=target)
       {
        min=Math.min(min,(e-st)+1);
        sum=sum-nums[st];
        st++;
       }
       e++;
      }
    if(min==Integer.MAX_VALUE) return 0;
      return min;
    }
}