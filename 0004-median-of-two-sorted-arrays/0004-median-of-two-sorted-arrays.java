class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            a.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            a.add(nums2[i]);
        }
        Collections.sort(a);
        int[]arr1=new int[a.size()];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=a.get(i);
        }
        if(arr1.length % 2==0)
        {
          double b=(double)((arr1[arr1.length/2])+(arr1[(arr1.length/2)-1]));
          return b/2;
        }
          return (double)(arr1[arr1.length/2]);
    }
}