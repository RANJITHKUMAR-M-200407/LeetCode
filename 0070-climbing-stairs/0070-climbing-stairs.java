class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int ans=0;
       int[]arr = new int[n+1];
       int sum=0;
       arr[0]=1;
       arr[1]=2;
       arr[2]=3;
       for(int i=3;i<arr.length;i++)
       {
        arr[i]=arr[i-1]+arr[i-2];
       }
       System.out.print(Arrays.toString(arr));
       return arr[n-1];
    }
}