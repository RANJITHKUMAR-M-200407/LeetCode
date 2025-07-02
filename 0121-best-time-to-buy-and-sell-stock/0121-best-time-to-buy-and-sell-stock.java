class Solution {
    public int maxProfit(int[] arr) {
      int min = arr[0];
      int profit=0;
      int max=0;
      for(int i=1;i<arr.length;i++){
         profit= arr[i]-min;
         min= Math.min(min,arr[i]);
         max= Math.max(max,profit);
      } 
      return max;
    }
}