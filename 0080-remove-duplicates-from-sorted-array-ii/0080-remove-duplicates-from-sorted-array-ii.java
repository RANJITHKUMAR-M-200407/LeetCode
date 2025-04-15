class Solution {
    public int removeDuplicates(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      }  
      int[]ans= new int[nums.length];
      int ind=0;
     for(int i=0;i<nums.length;i++)
     {
   if(map.containsKey(nums[i]))
   {
    if(map.get(nums[i])>=2)
    {
        ans[ind++]=nums[i];
        ans[ind++]=nums[i];
    }
    else
    {
        ans[ind++]=nums[i];
    }
    map.remove(nums[i]);
   }
     }
     for(int i=0;i<ans.length;i++)
     {
        nums[i]=ans[i];
     }
  return ind;
    }
}