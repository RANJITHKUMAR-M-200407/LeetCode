class Solution {
    public String makeGood(String s) {
     Stack<Character> st = new Stack<>();
     StringBuilder sb = new StringBuilder();
     if(s.equals("Pp"))
     {
        return "";
     }
     for(int i=0;i<s.length();i++)
     {
        if(!st.isEmpty() && (s.charAt(i)>='A' && s.charAt(i)<='Z') && (st.peek()==(char)(s.charAt(i)+32) ))
        {
            st.pop();
        }
         else if(!st.isEmpty() && (s.charAt(i)>='a' && s.charAt(i)<='z') && (st.peek()==(char)(s.charAt(i)-32) ))
         {
             st.pop();
         }
        else
        {
            st.push(s.charAt(i));
        }
     }
     while(!st.isEmpty())
     {
     sb.append(st.pop());
     }
     return sb.reverse().toString();
       
    }
}