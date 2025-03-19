class Solution {
    public int lengthOfLongestSubstring(String s) {
      ArrayList<Character> list = new ArrayList<>();
      int max=0;
      int st=0;
      int i=0;
   //  if(s.length()==1) return 1;
     while(i<s.length() && st<s.length())
     {
     if(!list.contains(s.charAt(st))) 
     {
      list.add(s.charAt(st));
      st++;
     } 
     else
     {
        if(max<list.size())  max = list.size();
        list.clear();
        i++;
         st=i;
     }
     }
     if(max<list.size()) 
     {
         max = list.size();
        return max;
     }
      return max;
    }
}