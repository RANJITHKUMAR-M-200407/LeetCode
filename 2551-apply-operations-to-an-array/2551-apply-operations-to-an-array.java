class Solution {
    public int[] applyOperations(int[] arr) {
        int ind=0;
       while(ind<arr.length-1)
       {
        if(arr[ind]==arr[ind+1])
        {
            arr[ind]=arr[ind]*2;
            arr[ind+1]=0;
            ind=ind+2;
        }
        else 
        {
            ind++;
        }
       }
       int[]ans = new int[arr.length];
       int ind1=0;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]!=0)  
           {
            ans[ind1]=arr[i];   
            ind1++;
           }
       } 
       return ans;
    }
}