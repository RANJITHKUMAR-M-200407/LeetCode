class Solution {
    public int countDigits(int num) {
       int ans=0;
        int count=0;
        int sol=num;
       while(num>0)
       {
         ans=num%10;
         if(sol%ans==0)
         {
          count++;
         }
         num=num/10;
       }
     return count; 
    }
}