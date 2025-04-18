class Solution {
    public int findTheWinner(int n, int k) {
     ArrayList<Integer> list = new ArrayList<>();
     for(int i=1;i<=n;i++)    list.add(i);
     int st =0;
     while(list.size()>1)
     {
      int del = (st+k)-1;
      st = del%list.size();
      list.remove(del%list.size());
     }
     return list.get(0);
    }
}