class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[]arr = new int[1001];
        int count=0;
        for(int i=0;i<nums1.length;i++)
        {
            if(arr[nums1[i]]==0) 
            {
                arr[nums1[i]]++;
            }
        }
          for(int i=0;i<nums2.length;i++)
        {
            if(arr[nums2[i]]==1) 
            {
                count++;
                arr[nums2[i]]++;
            }
        }
        int[]ans = new int[count];
        int ind=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==2)  ans[ind++]=i;
        }
        return ans;
    }
}