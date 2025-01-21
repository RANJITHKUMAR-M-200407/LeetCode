class Solution {
    public int countPrimes(int n) {
         if(n==0 || n==1 || n==2)
      {
        return 0;
      }
      n=n-1;
      int count=n-1;
      boolean[]arr= new boolean[n+1];
      Arrays.fill(arr,true);
     
      arr[0]=false;
      arr[1]=false;
      for(int i=2;i<=Math.sqrt(n);i++)
      {
        if(arr[i]==true)
        {
            for(int j=i*i;j<=n;j=j+i)
            {
                if(arr[j]==true)
                {
                    arr[j]=false;
                    count--;
                }
            }
        }
      } 
      return count; 
    }
}