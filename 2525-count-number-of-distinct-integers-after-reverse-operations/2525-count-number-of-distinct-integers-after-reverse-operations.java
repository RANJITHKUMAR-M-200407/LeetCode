class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int a=0;
        int b=0;
        int rev=0;
        for(int i=0;i<nums.length;i++)
        {
         arr.add(nums[i]);
         a=nums[i];
         rev=0;
         while(a>0)
         {
          b=a%10;
          rev=rev*10+b;
          a=a/10;
         }
         arr.add(rev);
        }
         HashSet<Integer> uniqueSet = new HashSet<>(arr);
         int count=uniqueSet.size();
         return count;
    }
}