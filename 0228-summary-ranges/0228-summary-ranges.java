class Solution {
    public List<String> summaryRanges(int[] nums) {
       ArrayList<String> list = new ArrayList<>();
      for(int i=0;i<nums.length;i++)
      {
        int start=nums[i];
        boolean b = false;
        while(i<nums.length-1 && nums[i]+1==nums[i+1])
        {
            b=true;
            i++;
        }
        if(b)
        {
            list.add(start+"->"+nums[i]);
        }
        else list.add(String.valueOf(start));
      }
    return list;
    }
}