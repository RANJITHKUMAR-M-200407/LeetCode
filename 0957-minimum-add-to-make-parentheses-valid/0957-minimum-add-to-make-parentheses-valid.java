class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();  // Valid pair found, remove it
            } else {
                st.push(c);  // Push only unmatched parentheses
            }
        }
        return st.size();  // Unmatched parentheses count
    }
}
