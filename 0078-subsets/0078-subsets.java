class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>> outer = new ArrayList<>();
      outer.add(new ArrayList<>());
      for(int val : nums)
      {
        int n = outer.size();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
            internal.add(val);
            outer.add(internal);
        }
      }
      return outer;
    }
}