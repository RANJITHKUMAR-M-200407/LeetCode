class Solution {
    public int minimumChairs(String s) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
         if(s.charAt(i)=='E') sum++;
         else sum--;
         max=Math.max(max,sum);
        }
        return max;
    }
}