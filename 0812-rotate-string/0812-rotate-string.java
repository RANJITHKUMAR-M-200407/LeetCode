class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String b = s+s;
        if(b.contains(goal)) return true;
        return false;
    }
}