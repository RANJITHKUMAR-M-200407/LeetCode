class Solution {
    public int pivotInteger(int n) {
        int[]arr = new int[n];
        for(int i=1;i<=arr.length;i++)
        {
            arr[i-1]=i;
        }
        System.out.print(Arrays.toString(arr));
        int left[] = new int[n];
        int left1=0;
        int[] right = new int[n];
        int right1=0;
        for(int i=0;i<arr.length;i++)
        {
            left[i]=left1;
            left1+=arr[i];
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            right[i]=right1;
            right1+=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(left[i]==right[i]) return i+1;
        }
        return -1;
    }
}