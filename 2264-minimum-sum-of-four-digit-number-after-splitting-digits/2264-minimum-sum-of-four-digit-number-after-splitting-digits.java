class Solution {
    public int minimumSum(int num) {
       String a = String.valueOf(num);
       String[]arr = a.split("");
       Arrays.sort(arr);
       int val1 = (Integer.valueOf(arr[0])*10)+Integer.valueOf(arr[arr.length-1]);
       int val2 = (Integer.valueOf(arr[1])*10)+Integer.valueOf(arr[arr.length-2]);
       return val1+val2;
    }
}