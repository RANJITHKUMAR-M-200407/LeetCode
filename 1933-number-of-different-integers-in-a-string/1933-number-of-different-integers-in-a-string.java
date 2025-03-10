class Solution {
    public int numDifferentIntegers(String word) {
      HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)>='0' && word.charAt(i)<='9')
            {
                sb.append(word.charAt(i));
            }
            else if(sb.length()>0)
            {
                set.add(sb.toString().replaceFirst("^0+", ""));
                sb.setLength(0);            }
        }
        if(sb.length()>0)      set.add(sb.toString().replaceFirst("^0+", ""));
        return set.size();   
    }
}