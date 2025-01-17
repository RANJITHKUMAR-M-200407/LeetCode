class Solution {
    public int distinctAverages(int[] nums) {
      Arrays.sort(nums);
      double a=0;
      HashSet<Double> b= new HashSet<>();
      int n=nums.length;
      for(int i=0;i<=((nums.length/2)-1);i++)
      { 
        a=((nums[i]+nums[n-1-i])/2.0);
        b.add(a);
      }  
    return b.size();
    }
}