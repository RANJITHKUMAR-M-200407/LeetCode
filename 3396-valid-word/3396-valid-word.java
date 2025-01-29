class Solution {
    public boolean isValid(String word) {
        int vow=0;
        int count=0;
        if(word.length()<3)
        {
            return false;
        }
        for(int i=0;i<word.length();i++)
        {
            char a=word.charAt(i);
            if(!Character.isLetterOrDigit(a))
            {
                return false;
            }
            if("AEIOUaeiou".indexOf(a)!=-1)
            {
                vow++;
            }
           else if(Character.isLetter(a))
            {
                count++;
            }
        }
        return (vow>0 && count>0);
    }
}