class Solution {
    public int[][] merge(int[][] nums) {
      Arrays.sort(nums,(a,b) -> Integer.compare(a[0],b[0]));
      int i=1;
      ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 
      ArrayList<Integer> list2 = new ArrayList<>();
      list2.add(nums[0][0]);
      list2.add(nums[0][1]);
      list.add(list2);
       while (i < nums.length) {
            ArrayList<Integer> last = list.get(list.size() - 1);
            if (last.get(1) >= nums[i][0]) {
                last.set(1, Math.max(last.get(1), nums[i][1]));
            } else {
                ArrayList<Integer> newInterval = new ArrayList<>();
                newInterval.add(nums[i][0]);
                newInterval.add(nums[i][1]);
                list.add(newInterval);
            }
            i++;
        }
        int[][] result = new int[list.size()][2];
        for (int j = 0; j < list.size(); j++) {
            result[j][0] = list.get(j).get(0);
            result[j][1] = list.get(j).get(1);
        }
        return result;     
    }
}