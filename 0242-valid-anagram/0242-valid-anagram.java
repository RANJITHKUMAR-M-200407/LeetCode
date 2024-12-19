class Solution {
    public boolean isAnagram(String s, String t) {
      char[]str1=s.toCharArray();
      char[]str2=t.toCharArray();
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