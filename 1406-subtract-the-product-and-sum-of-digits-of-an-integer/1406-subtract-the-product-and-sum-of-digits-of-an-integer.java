class Solution {
    public int subtractProductAndSum(int n) {
        int sol=n;
        int ans=0;
        int res=1;
        int sum1=0;
        int sum2=0;
        while(n>0)
        {
          ans=n%10;
          res=res*ans;
          n=n/10;
        }
        while(sol>0)
        {
         sum1=sol%10;
         sum2=sum2+sum1;
         sol=sol/10;
        }
        return res - sum2; 
    }
}