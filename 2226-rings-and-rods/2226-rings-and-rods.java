class Solution {
    public int countPoints(String str) {
      int[] b = new int[10];
      int[] r = new int[10];
      int[] g = new int[10];
      for(int i=1;i<str.length();i++)
      {
       if(str.charAt(i-1)=='B' && b[str.charAt(i)-'0']==0)  b[str.charAt(i)-'0']++;
      } 
        for(int i=1;i<str.length();i++)
      {
       if(str.charAt(i-1)=='R' && r[str.charAt(i)-'0']==0)  r[str.charAt(i)-'0']++;
      } 
        for(int i=1;i<str.length();i++)
      {
       if(str.charAt(i-1)=='G' && g[str.charAt(i)-'0']==0)  g[str.charAt(i)-'0']++;
      } 
      int count=0;
  for(int i=0;i<b.length;i++)
  {
    if(b[i]==1 && g[i]==1 && r[i]==1)   count++;
  }
  return count;
    }
}