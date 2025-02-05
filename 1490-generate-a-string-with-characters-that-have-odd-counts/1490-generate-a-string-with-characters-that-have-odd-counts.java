class Solution {
    public String generateTheString(int n) {
        String a="a";
        String b="b";
        String c="";
        if(n%2!=0)
        {
            for(int i=0;i<n;i++)
            {
             c=c+a;
            }
            return c;
        }
        else
        {
            for(int i=0;i<n-1;i++)
            {
             c=c+a;
            }  
        }
        return c+b;
    }
}