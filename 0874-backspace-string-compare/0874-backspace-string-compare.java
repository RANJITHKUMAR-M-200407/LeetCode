class Solution {
    public boolean backspaceCompare(String s, String t) {
     Stack<Character> st1 = new Stack<>();
     Stack<Character> st2 = new Stack<>();
     StringBuilder sb1 = new StringBuilder();
     StringBuilder sb2 = new StringBuilder();
     for(int i=0;i<s.length();i++)
     {
     if(!st1.isEmpty() && s.charAt(i)=='#')
     {
        st1.pop();
     }
     else if(s.charAt(i)!='#')
     {
        st1.push(s.charAt(i));
     }
     }   
       for(int i=0;i<t.length();i++)
     {
     if(!st2.isEmpty() && t.charAt(i)=='#')
     {
        st2.pop();
     }
     else if(t.charAt(i)!='#')
     {
        st2.push(t.charAt(i));
     }
     }
     while(!st1.isEmpty())
     {
        sb1.append(st1.pop());
     }   
      while(!st2.isEmpty())
     {
        sb2.append(st2.pop());
     }   
     System.out.print(sb1+" "+sb2);
     return sb1.reverse().toString().equals(sb2.reverse().toString());
    }
}