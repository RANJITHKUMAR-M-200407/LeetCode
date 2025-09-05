class Solution {
    public int[] diStringMatch(String s) {
      int[] arr = new int[s.length()+1];
      int first = 0;
      int last = s.length();
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='I') arr[i] = first++;
        else arr[i] = last--;
      }
      if(s.charAt(s.length()-1) =='D') arr[arr.length-1] = first++;
      else arr[arr.length-1] = last--;
      return arr;
    }
}