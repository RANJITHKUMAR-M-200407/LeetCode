class Solution {
    public int longestPalindrome(String s) {
       int[]arr = new int[256];
       for(int i=0;i<s.length();i++)
       {
       if(s.charAt(i)>='a' && s.charAt(i)<='z') arr[s.charAt(i)-'a']++;
       else arr[s.charAt(i)-'A'+100]++;
       } 
       boolean flag=true;
     int sum=0;
     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]%2==0)
        {
            sum=sum+arr[i];
        }
        else
        {
            flag=false;
             sum=sum+(arr[i]-1);
        }
     }
     if(flag==false) return sum+1;
     return sum;
    }
}