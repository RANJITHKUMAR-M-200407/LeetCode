class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length==k) return k;
        int copy=k;
        int count=0;
        int max=0;
        for(int i=0;i<=nums.length;i++)
        {
         k=copy;
         count=0;
         for(int j=i;j<nums.length;j++)
         {
            if(nums[j]==0) 
            {
                 if(k>0)
                 {
                  k--;
                 } 
                  else  break;
            }
            count++;
            }
             if(max<count)
            {
                max=count;
            }
         }
        
        return max;
    }
}
