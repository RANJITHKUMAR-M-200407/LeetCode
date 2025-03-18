class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        ArrayList<Integer> list4= new ArrayList<>();
        List<List<Integer>> map = new ArrayList<>();
       for(int i=0;i<nums1.length;i++)
       {
        list1.add(nums1[i]);
       }
        for(int i=0;i<nums2.length;i++)
       {
        list2.add(nums2[i]);
       }
        for(int i=0;i<nums1.length;i++)
       {
        if(!list2.contains(nums1[i]))
        {
            if(!list3.contains(nums1[i]))    list3.add(nums1[i]);
        }
       }
        for(int i=0;i<nums2.length;i++)
       {
        if(!list1.contains(nums2[i]))
        {
           if(!list4.contains(nums2[i]))  list4.add(nums2[i]);
        }
       }
       map.add(list3);
       map.add(list4);
       return map;
       
    }
}