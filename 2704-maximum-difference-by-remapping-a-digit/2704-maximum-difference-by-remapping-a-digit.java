class Solution {
    public int minMaxDifference(int num) {
    // int copy=num;
     String a = String.valueOf(num);
     String b = String.valueOf(num);
     char ch9=' ';
     char ch0=' ';
     for(int i=a.length()-1;i>=0;i--)
     {
        if(a.charAt(i)!='9')  ch9=a.charAt(i);
         if(a.charAt(i)!='0') ch0=a.charAt(i);
     }   
     String[]arr1 = a.split("");
     String[]arr2 = b.split("");
     for(int i=0;i<arr1.length;i++)
     {
        if(arr1[i].equals(String.valueOf(ch9))) arr1[i]="9";
        if(arr2[i].equals(String.valueOf(ch0))) arr2[i]="0";
     }
     int num1=0;
     int num2=0;
     for(int i=0;i<arr1.length;i++)
     {
        num1=num1*10+Integer.valueOf(arr1[i]);
        num2=num2*10+Integer.valueOf(arr2[i]);
     }
    //  System.out.println(ch9);
    //  System.out.println(ch0);
    //  System.out.println(num1);
    //  System.out.println(num2);
     return num1-num2;

    }
}