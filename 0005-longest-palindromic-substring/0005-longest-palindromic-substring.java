class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        int st = 0;
        int e = 0;
        for(int i=0;i<s.length();i++){
            int left = ans(s,i,i);
            int right = ans(s,i,i+1);
            int len = Math.max(left,right);
            if(len>e-st){
                st = i-(len-1)/2;
                e = i+len/2; 
            }
        }
       return s.substring(st,e+1);
    }
    public static int ans(String a,int left, int right){
     int l = left;
     int r = right;
     while(l>=0 && r<a.length() && a.charAt(l)==a.charAt(r)){
        l--;
        r++;
     }
     return r-l-1;
    }
}