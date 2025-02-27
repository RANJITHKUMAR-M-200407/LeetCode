class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         ArrayList<Integer> list = new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int ind1=0;
        for (int i = 0; i < matrix.length; i++) {
            min=Integer.MAX_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]<min)  
                {
                 min=matrix[i][j]; 
                 ind1=j;
                }
            }
            if(min==max(matrix, ind1))
            {
            list.add(min);
            return list;
            }
        }
        return list;
       }

     public static int max(int[][]matrix,int ind1)
       {
        int max=0;
        for (int i = 0; i < matrix.length; i++) {
            if(max<matrix[i][ind1]) max = matrix[i][ind1];
        }
        return max;
       }
}