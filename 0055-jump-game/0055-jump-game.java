class Solution {
    public boolean canJump(int[] nums) {
        if(nums[0]==0 && nums.length==1) return true; 
            int maxind=0;
       for(int i=0;i<nums.length;i++)
       {
        if(i<=maxind){
           maxind = Math.max(maxind,nums[i]+i);
        }
       }
       if(maxind>=nums.length-1) return true;
       return false;
    }
}