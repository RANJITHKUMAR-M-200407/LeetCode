class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               if(matrix[i][j]==-1)  matrix[i][j]= max(matrix,i,j);
           } 
        }   
        return matrix;
    }
     public static int max(int[][] matrix,int ind1,int ind2)
        {
         int max =0;
         for (int i = 0; i < matrix.length; i++) {
               if(max<matrix[i][ind2]) max=matrix[i][ind2];
         }
         return max;
        }
}