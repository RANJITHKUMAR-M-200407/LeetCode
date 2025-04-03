class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
       int[]arr2= new int[101];
       int[]ans= new int[2];
       for(int i=0;i<nums2.length;i++)
       {
        arr2[nums2[i]]++;
       } 
       int count1=0;
       for(int i=0;i<nums1.length;i++)
       {
        if(arr2[nums1[i]]>0)  count1++;
       }
       int[]arr1= new int[101];
       int count2=0;
        for(int i=0;i<nums1.length;i++)
       {
        arr1[nums1[i]]++;
       } 
        for(int i=0;i<nums2.length;i++)
       {
        if(arr1[nums2[i]]>0)  count2++;
       }
       ans[0]=count1;
       ans[1]=count2;
       return ans;
    }
}