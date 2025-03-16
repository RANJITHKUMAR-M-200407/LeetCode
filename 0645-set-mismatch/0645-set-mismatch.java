class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

       int[]ans = new int[2];
       Arrays.sort(nums);
       for(int i=0;i<nums.length-1;i++)
       {
        if(nums[i]==nums[i+1])
        {
            ans[0]=nums[i];
        }
        set.add(nums[i]);
       } 
       set.add(nums[nums.length-1]);
       for(int i=1;i<=nums.length;i++)
       {
        if(!set.contains(i))
        {
         ans[1]=i;
        //return ans;
        } 
       }
       return ans;
    }
}