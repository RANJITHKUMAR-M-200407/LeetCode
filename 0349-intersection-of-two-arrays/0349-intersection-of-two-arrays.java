class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!list1.contains(nums1[i])) list1.add(nums1[i]);
        }
           for(int i=0;i<nums2.length;i++)
        {
            if(!list3.contains(nums2[i])) list3.add(nums2[i]);
        }

          ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<list3.size();i++)
        {
            if(list1.contains(list3.get(i))) list2.add(list3.get(i));
        }
        int[]ans = new int[list2.size()];
        for(int i=0;i<list2.size();i++)
        {
         ans[i]=list2.get(i);
        }
       return ans;
    }
}