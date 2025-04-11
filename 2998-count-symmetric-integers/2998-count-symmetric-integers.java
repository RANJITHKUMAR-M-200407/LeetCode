class Solution {
    public int countSymmetricIntegers(int low, int high) {
        if(low<=10 && high<=10) return 0;
        int count=0;
        int sum1=0;
        int sum2=0;
        for(int i=low;i<=high;i++)
        {
            sum1=0;
            sum2=0;
            int val=i;
        String a = String.valueOf(val);
        if(a.length()%2 == 0 && a.length() > 1) 
        {
   for(int j=0;j<a.length()/2;j++)
   {
    sum1+= a.charAt(j)-'0';
   }
    for(int k=a.length()/2;k<a.length();k++)
   {
    sum2+=a.charAt(k)-'0';
   }
if(sum1==sum2)  count++;    
        }
        
    }
  return count;
    }
}