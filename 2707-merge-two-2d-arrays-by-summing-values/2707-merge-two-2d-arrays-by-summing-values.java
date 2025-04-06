class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
       HashMap<Integer,Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i][0], nums1[i][1]);
            min=Math.min(min,nums1[i][0] );
            max=Math.max(max, nums1[i][0]);
        }
        for (int i = 0; i < nums2.length; i++) {
            int ele=map.getOrDefault(nums2[i][0], 0);
            map.put(nums2[i][0], nums2[i][1]+ele);
            min=Math.min(min,nums2[i][0]);
            max=Math.max(max,nums2[i][0]);
        }
        int[][]ans = new int[map.size()][2];
        int ind=0;
        for (int i = min; i <=max; i++) {
            if(map.containsKey(i))  {
                ans[ind][0]=i;
                ans[ind][1]=map.get(i);
                ind++;
            }
        }
        return ans; 
    }
}