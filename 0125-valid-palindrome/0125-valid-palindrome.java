class Solution {
    public boolean isPalindrome(String s) {
      String a= new String();
        for(int i=0;i<s.length();i++)
        {
         if(s.charAt(i)>='0' && s.charAt(i)<='9'||(s.charAt(i)>='a'&& s.charAt(i)<='z'))
         {
           a=a+s.charAt(i);
         }
         if ((s.charAt(i)>='A' && s.charAt(i)<='Z'))
         {
            a=a+s.charAt(i);  
         }
        } 
        a=a.toLowerCase();
        StringBuilder b=new StringBuilder(a); 
        b.reverse();
        if(a.equals(b.toString()))
        {
           return true;
        }
        return false;  
    }
}