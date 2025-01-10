class Solution {
    public String firstPalindrome(String[] words) {
    
       for(int i=0;i<words.length;i++)
       {
        StringBuilder sb = new StringBuilder();
        sb.append(words[i]);
        if(words[i].equals(sb.reverse().toString())){
            return words[i];

        }
       } 
       return "";
    }
}