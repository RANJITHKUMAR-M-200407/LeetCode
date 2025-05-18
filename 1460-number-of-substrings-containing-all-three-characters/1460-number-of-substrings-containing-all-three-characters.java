class Solution {
    public int numberOfSubstrings(String s) {
  int c=0;
  int[]ans = {-1,-1,-1};
  int min1=0;
   for(int i=0;i<s.length();i++)
   {
   ans[s.charAt(i)-'a']=i;
   if(ans[0]!=-1 && ans[1]!=-1 && ans[2]!=-1)
   {
   min1=Math.min(ans[0],Math.min(ans[1],ans[2]));
   c=c+(min1)+1;
   }
   }
      return c;
    }
}
 //   for(int i=0;i<s.length();i++)
    //   {
    //     int[] ans = new int[3];
    //     for(int j=i;j<s.length();j++)
    //     {
    //         ans[s.charAt(j)-'a']=1;
    //         if(ans[0]+ans[1]+ans[2]==3)
    //         {
    //          c+=(s.length()-j);
    //          break;
    //         }
    //     }
    //   }  