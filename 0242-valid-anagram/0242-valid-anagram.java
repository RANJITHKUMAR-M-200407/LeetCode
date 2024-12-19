class Solution {
    public boolean isAnagram(String s, String t) {
      String[]str1=s.split("");
      String[]str2=t.split("");
      Arrays.sort(str1);
      Arrays.sort(str2);
      if(s.length()!=t.length())
      {
        return false;
      }
     else if(Arrays.equals(str1,str2))
      {
        return true;
      }
      return false;
    }
}