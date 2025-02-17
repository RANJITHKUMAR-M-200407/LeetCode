class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int k=0;
        int count=0;
      for(int i=0;i<word.length();i++)
      {
           if(word.charAt(i)==ch)
           {
            count++;
             sb.append(word.charAt(i));
             k=i;
            break;
           }
           else
           {
            sb.append(word.charAt(i));
           }
      }  if(count>0)
      {
         return sb.reverse().toString()+word.substring(k+1);
      }
      return word;
    }
}