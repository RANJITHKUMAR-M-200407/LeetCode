class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,arr,ans,target,new ArrayList<>());
        return ans;
    }
    public static void fun(int ind,int[]arr,List<List<Integer>> ans,int target,List<Integer> ds){
        if(ind==arr.length){
           if(target==0){
        ans.add(new ArrayList<>(ds));
      }
        return;
   }
      if(arr[ind]<=target){
       ds.add(arr[ind]);
       fun(ind,arr,ans,target-arr[ind],ds);   
       ds.remove(ds.size()-1);
      }
       fun(ind+1,arr,ans,target,ds);
    }
}