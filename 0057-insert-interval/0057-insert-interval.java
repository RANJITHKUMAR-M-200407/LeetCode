class Solution {
    public int[][] insert(int[][] nums, int[] nums2) {
        int i=0;
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        while(i<nums.length && nums[i][1]<nums2[0]){
         ArrayList<Integer> list = new ArrayList<>();
               list.add(nums[i][0]);
               list.add(nums[i][1]);
               list2.add(list);
               i++;
        }
        int min = nums2[0];
        int max = nums2[1];
         while(i<nums.length && nums[i][0]<=nums2[1]){
              min = Math.min(min,nums[i][0]);
              max = Math.max(max,nums[i][1]);
               i++;
        }
          ArrayList<Integer> list3 = new ArrayList<>();
          list3.add(min);
          list3.add(max);
        list2.add(list3);
         while(i<nums.length){
         ArrayList<Integer> list = new ArrayList<>();
               list.add(nums[i][0]);
               list.add(nums[i][1]);
               list2.add(list);
               i++;
        }
int[][]ans = new int[list2.size()][2];
for(int j=0;j<list2.size();j++){
    ans[j][0] = list2.get(j).get(0);
    ans[j][1] = list2.get(j).get(1);
}
 // System.out.print(list2);
return ans;
    }
}