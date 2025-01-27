class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int s=0;
        int e=row-1;
        int mid=0;
        while(s<=e)
        {
            mid=(s+e)/2;
            if(matrix[mid][0]<=target && matrix[mid][col-1]>=target)
            {
                break;
            }
            else if(matrix[mid][0]>target)
            {
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        int r=(s+e)/2;
        s=0;
        e=col-1;
        while(s<=e)
        {
          mid=(s+e)/2;
          if(matrix[r][mid]==target)
          {
            return true;
          }  
          else if(matrix[r][mid]>target)
          {
            e=mid-1;
          }
          else
          {
            s=mid+1;
          }
        }
     return false;
    }
}