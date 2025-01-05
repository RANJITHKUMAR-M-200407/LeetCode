class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        int sol[]=new int[nums.length];
     for(int i=0;i<nums.length;i++)
     {
      a.add(index[i],nums[i]);
     }   
     for(int i=0;i<nums.length;i++)
     {
        sol[i]=a.get(i);
     }
     return sol;
    }
}