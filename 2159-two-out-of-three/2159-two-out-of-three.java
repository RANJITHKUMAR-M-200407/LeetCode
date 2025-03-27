class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[]arr= new int[101];
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
         if(!list1.contains(nums1[i]))
         {
          arr[nums1[i]]++;
          list1.add(nums1[i]);

         }  
        }
          for(int i=0;i<nums2.length;i++)
        {
         if(!list2.contains(nums2[i]))  
         {
         list2.add(nums2[i]);
         arr[nums2[i]]++;
         }
        }
          for(int i=0;i<nums3.length;i++)
        {
         if(!list3.contains(nums3[i])) 
         { 
           list3.add(nums3[i]);
         arr[nums3[i]]++;
         }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==2 || arr[i]==3)  ans.add(i);
        }
       return ans;
    }
}