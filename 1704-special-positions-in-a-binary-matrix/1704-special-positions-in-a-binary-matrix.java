class Solution {
    public int numSpecial(int[][] mat) {
        int count1=0;
        int res=0;
        int c1v=0;
        for(int i=0;i<mat.length;i++)
        {
            count1=0;
            for(int j=0;j<mat[i].length;j++)
            {
               if(mat[i][j]==1)
               {
                c1v=j;
                count1++;
               } 
            }
            if(count1==1)
            {
             if(arr(mat,c1v)==1)
             {
                res++;
             }
            }
        }
        return res;
    }
    public static int arr(int[][]mat,int num)
    {
        int num1=0;
        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][num]==1)  num1++;
        }
        return num1;
    }
}