class Solution {
    public String sortSentence(String s) {
     String []a=s.split(" ");
    String[] ans=new String[a.length];
    for(int i=0;i<a.length;i++){
        char pos=a[i].charAt(a[i].length()-1);
        int position=pos-'0';
        StringBuilder sb=new StringBuilder(a[i]);
        sb.deleteCharAt(sb.length()-1);
        ans[position-1]=sb.toString();
    }
    String target="";
    for(int i=0;i<ans.length;i++){
        target+=" "+ans[i];
    }
    return target.trim();
      }
}