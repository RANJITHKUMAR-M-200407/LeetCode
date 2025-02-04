class Solution {
    public String capitalizeTitle(String title) {
        String a=title.toLowerCase();
        String[]arr=a.split(" ");
        String res="";
        String c="";
        String d="";
        for(int i=0;i<arr.length;i++)
        {
            String b=arr[i];
            if(b.length()<=2)
            {
              c=c+b+" ";  
            }
            else
            {
            d=b.substring(0,1).toUpperCase();
            c=c+d+b.substring(1)+" ";
            }
        }
        return c.trim();
    }
}