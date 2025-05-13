class Solution {
    public long minSum(int[] nums1, int[] nums2) {
       long sum1=0,sum2=0,z1=0, z2=0;
       for(int i=0;i<nums1.length;i++)
       {
        if(nums1[i]==0) 
        {
            z1++;
            sum1+=1;
        }
       else  sum1+=nums1[i];
       }
       for(int i=0;i<nums2.length;i++)
       {
        if(nums2[i]==0)
        {
          z2++;
          sum2+=1;
        }
       else sum2+=nums2[i];
       } 
       if((z1==0 && sum2>sum1) || (z2==0 && sum1>sum2))  return -1;
  return Math.max(sum1, sum2);
    }
}