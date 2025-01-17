class Solution {
    public String replaceDigits(String s) {
        StringBuilder b= new StringBuilder();
        char[]a=s.toCharArray();
       for(int i=0;i<s.length();i++)
       {
       if(Character.isLetter(a[i]))
       {
        b.append(a[i]);
       }
       else{
        int c=Character.getNumericValue(a[i]);
        b.append((char)(a[i-1]+c));
       }
    }
    return b.toString();
    }
}