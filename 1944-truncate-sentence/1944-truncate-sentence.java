class Solution {
    public String truncateSentence(String s, int k) {
     String[]a=s.split(" ");
     String b= new String("");
     for(int i=0;i<k;i++)
     {
       b=b+" "+a[i];
     }
     return b.trim();
    }
}