class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
     int[]arr = new int[201];
     for(int i=0;i<nums.length;i++)
     {
        arr[nums[i]]++;
     }   
     int[]ans = new int[201];
     List<List<Integer>> list = new ArrayList<>();
     while(!Arrays.equals(arr,ans))
     {
        ArrayList<Integer> list2 = new ArrayList<>();
   for(int i=0;i<arr.length;i++)
   {
  if(arr[i]>0)
  {
    arr[i]=arr[i]-1;
    list2.add(i);
  }
   }
   list.add(list2);
     }
     return list;
    }
}