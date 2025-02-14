class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
         if(!st.isEmpty() && (s.charAt(i)>='0' && s.charAt(i)<='9'))
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