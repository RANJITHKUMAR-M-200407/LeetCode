class Solution {
    public int maxDistance(String s, int k) {
        int lat = 0,lon = 0,ans=0; 
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='N') lat++;
        else if (s.charAt(i)=='E') lon++;
        else if (s.charAt(i)=='S') lat--;
        else lon--;
  ans = Math.max(ans,Math.min(Math.abs(lat)+Math.abs(lon)+k*2,i+1));
      }  
     
return ans;
    }
}