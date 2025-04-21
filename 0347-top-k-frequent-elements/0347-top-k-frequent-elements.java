class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
      } 
    int[]arr = new int[k];
    //  ArrayList<Integer> list = new ArrayList<>(); 
      for(int i=0;i<k;i++)
      {
        int ky=0;
        int val=0;
     for(Map.Entry<Integer,Integer> entry : map.entrySet())
     {
      if(entry.getValue()>val)
      {
        val = entry.getValue();
        ky = entry.getKey();
      }
     }
     arr[i]=ky;
     map.remove(ky);
      }
      return arr;
    }
}