class Solution {
    public int canBeTypedWords(String text, String b) {
    String[]arr = text.split(" ");
    char[] ch = b.toCharArray();
    int ans=0;
   for(int i=0;i<arr.length;i++)
   {
    boolean flag = true;
    for(int j=0;j<ch.length;j++)
    {
         if(arr[i].indexOf(ch[j])!=-1)  
         {
 flag = false;
 break;
         }
    }
    if(flag)  ans++;
   }
    return ans;   
    }
}