class Solution {
    public int maximumCount(int[] nums) {
        int count=0;
        int ans=0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]<0)
           {
            count++;
           } 
           if(nums[i]>0)
           {
             ans++;
           }
        }
       return Math.max(count, ans);  
    }
}