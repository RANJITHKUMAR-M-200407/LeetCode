class Solution {
    public int countPairs(int[] nums, int k) {
        int ans=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                  ans=i*j;
                  if(ans%k==0)
                  {
                    count++;
                  }
                }
            }
        }
        return count;
    }
}