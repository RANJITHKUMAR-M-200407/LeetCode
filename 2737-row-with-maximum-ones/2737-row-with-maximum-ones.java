class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int count=0;
        int[]arr = new int[2];
        int max=0;
        for(int i=0;i<mat.length;i++)
        {
            count=0;
            for(int j=0;j<mat[i].length;j++)
            {
            if(mat[i][j]==1)  count++;
            }
            if(max<count)  
            {
                max=count;
                arr[0]=i;
                arr[1]=count;
            }
        }
        return arr;
    }
}