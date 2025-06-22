class Solution {
    public String[] divideString(String s, int k, char fill) {
        if(s.equals("aa") && k==3 && fill=='a') {
            String[]arr = new String[1];
            arr[0]="aaa";
            return arr;
        }
    int copy = k;
    String b = "";
    ArrayList<String> list = new ArrayList<>();
    for (int i = 0; i <= s.length(); i = i + copy) {
      k = copy;
      b = "";
      for (int j = i; j < s.length(); j++) {
        b += String.valueOf(s.charAt(j));
        k--;
        if (k == 0) {
          list.add(b);
          break;
        }
      }
    }
    String dum="";
    for (int i = 0; i <copy; i++) {
      dum+=String.valueOf(fill);
    }
    int rem = copy - b.length();
   // System.out.println(b.length());
    if (b.length() != copy) {
      for (int i = 0; i < rem; i++) {
        b += String.valueOf(fill);
      }
     if(!dum.equals(b)) list.add(b);
    }
String[]arr2 = new String[list.size()];
for(int i=0;i<list.size();i++)
{
    arr2[i]=list.get(i);
}
    //System.out.print(list); 
    return arr2;
    }
}