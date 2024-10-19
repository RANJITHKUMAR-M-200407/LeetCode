class Solution {
    public int[] getConcatenation(int[] nums) {
         int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
          ans[i]=nums[i];
        }
        int[] result = IntStream.concat(Arrays.stream(nums), Arrays.stream(ans)).toArray();
        return result;
    }
}