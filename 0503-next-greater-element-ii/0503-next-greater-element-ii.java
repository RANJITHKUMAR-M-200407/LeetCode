class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        int n = nums.length;
        Arrays.fill(ans,-1);
      for(int i=0;i<n;i++)
      {
       for(int j=i+1;j<i+n;j++){
        if(nums[i]<nums[j%n]){
            ans[i] = nums[j%n];
            break;
        }
       }
      }  
      return ans;
    }
}