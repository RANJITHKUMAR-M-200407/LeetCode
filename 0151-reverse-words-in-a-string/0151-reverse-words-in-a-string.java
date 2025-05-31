class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       String[] a = s.split(" ");
       String b =" ";
    for(int i=a.length-1;i>=0;i--)
    {
   if(a[i].length()>0)  b+=a[i]+" ";
    }
return b.trim();
    }
}