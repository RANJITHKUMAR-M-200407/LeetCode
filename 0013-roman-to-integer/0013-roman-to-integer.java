class Solution {
    public int romanToInt(String s) {
      HashMap<Character,Integer> map = new HashMap<>();
      map.put('I',1);
      map.put('V',5);
      map.put('X',10);
      map.put('L',50);
      map.put('C',100);
      map.put('D',500);
      map.put('M',1000);
      int ind=s.length()-1;
     int sum=0;
     sum+=map.get(s.charAt(ind));
      for(int i=s.length()-2;i>=0;i--)
      {
        if(map.get(s.charAt(i))>=map.get(s.charAt(i+1)))  sum+= map.get(s.charAt(i));
        else   sum-= map.get(s.charAt(i));
      }
      return sum;
    }
}