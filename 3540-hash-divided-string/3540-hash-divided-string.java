class Solution {
    public String stringHash(String s, int k) {
        int sum=0;
        int ans=0;
        char ch = ' ';
       StringBuilder sb = new StringBuilder();
       int mod=0;
       for(int i=0;i<=s.length()-k;i=i+k)
       {
        ch=' ';
        int val=0;
        sum=0;
        for(int j=i;j<i+k;j++)
        {
        val=(int)(s.charAt(j)-'a');
        sum+=val;
        }
       //  System.out.print(sum+" ");
        int avg =(int)(sum%26);
        ch = (char)(avg+97);
        sb.append(ch);
         //System.out.print(ch);
       
       }
       return sb.toString();
    }
}