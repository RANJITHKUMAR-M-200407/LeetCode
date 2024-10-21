class Solution {
    public int countEven(int num) {
      int ans=0;
        int sol=0;
        int sum=0;
      for (int j = 1; j <=num; j++) {
       sol=0;
       int i=j;
       while(i> 0)
       {
       ans=i%10;
       sol=sol+ans;
       i=i/10;
       }
       i++;
       if(sol%2==0) sum++;
      }
       
       return sum;   
    }
}