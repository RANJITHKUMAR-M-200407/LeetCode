class Solution {
    public int findTheWinner(int n, int k) {
     ArrayList<Integer> list = new ArrayList<>();
     for(int i=1;i<=n;i++)    list.add(i);
     int ele=0;
    // int copy=k;
    // list.remove((copy%list.size())-1);
    // copy=copy-1;
     int st =0;
     while(list.size()>1)
     {
      int del = (st+k)-1;
      st = del%list.size();
      list.remove(del%list.size());
     }
     System.out.print(list);
     return list.get(0);

    }
}