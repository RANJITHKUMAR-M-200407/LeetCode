class Solution {
    public boolean isSameAfterReversals(int num) {
       int a=num;
       int c=0;
       int d=0;
       int rev1=0;
       int rev2=0;
        while(a>0)
        {
         c=a%10;
         rev1=rev1*10+c;
         a/=10;
        }
        int rev11=rev1;
        while(rev1>0)
        {
         d=rev1%10;
         rev2=rev2*10+d;
         rev1/=10;
        }
        if(rev2==num)
        {
            return true;
        }
        return false;
    }
}