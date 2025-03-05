class Solution {
    public int getLucky(String s, int k) {
        int val=0;
        int mul=0;
        int res=0;
        for(int i=0;i<s.length();i++)
        {
         val=(int)s.charAt(i)-'a'+1;
         res=res+((val%10)+(val/10));
          
        }
        System.out.print(res);
        int sum=res;
       // long mulval=mul;
        while(k>1)
        {
            sum=0;
         while(res>0)
         {
            sum=sum+(res%10);
            res/=10;
         }
       res=sum;
         k--;
        }
        return sum;
    }
}