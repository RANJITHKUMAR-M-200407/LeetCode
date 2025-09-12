class Solution {
    public void duplicateZeros(int[] arr) {
     int i=0,j=0;
     int[] ans = new int[arr.length];
     if(Arrays.equals(arr,ans)) return;
     while(i<arr.length && j<arr.length){
        if(arr[i]==0){
            ans[j++] = 0;
            if(j<arr.length)  ans[j++] = 0;
        }
        else ans[j++] = arr[i];
        i++; 
     }
     for(int k=0;k<arr.length;k++){
        arr[k] = ans[k];
     }

    }
}