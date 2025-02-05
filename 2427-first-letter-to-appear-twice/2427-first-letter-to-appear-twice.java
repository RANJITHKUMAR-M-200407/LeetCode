class Solution {
    public char repeatedCharacter(String s) {
        char[]arr=s.toCharArray();
        char a=' ';
        String b="";
        for(int i=0;i<arr.length;i++)
        { 
            a=arr[i];
         if(!b.contains(String.valueOf(a)))
         {
            b=b+String.valueOf(a);
         }  
         else
         {
            return a;
         } 
           
       }
        
        return ' ';
    }
}