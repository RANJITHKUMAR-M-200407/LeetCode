class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
     int[]suffix= new int[nums.length];
     int[]prefix= new int[nums.length];
     HashSet<Integer> set = new HashSet<>();
     for(int i=0;i<nums.length;i++)
     {
        set.clear();
        for(int j=i+1;j<nums.length;j++)
        {
            set.add(nums[j]);
        }
        suffix[i]=set.size();
     }  
      for(int i=nums.length-1;i>=0;i--)
     {
        set.clear();
        for(int j=i;j>=0;j--)
        {
            set.add(nums[j]);
        }
        prefix[i]=set.size();
     }  
     int[]ans= new int[nums.length];
     for(int i=0;i<nums.length;i++)
     {
        ans[i]=prefix[i]-suffix[i];
     }
//  System.out.println(Arrays.toString(prefix));
//      System.out.print(Arrays.toString(suffix));
     return ans; 
    }
}