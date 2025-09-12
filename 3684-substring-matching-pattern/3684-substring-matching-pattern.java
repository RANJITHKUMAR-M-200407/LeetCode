class Solution {
    public boolean hasMatch(String s, String p) {
      int ind = p.indexOf("*");
      int first = s.indexOf(p.substring(0,ind));
      int sec = s.indexOf(p.substring(ind+1),first+ind);
      if(first!=-1 && sec!=-1) return true;
      return false;
    }
}