class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<>();
    for(int i=1;i<=numRows;i++){
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int j=1;j<=i;j++){
            if(j==1 || j==i) list2.add(1);
            else{
                int val = list.get(list.size()-1).get(j-2)+list.get(list.size()-1).get(j-1);
                list2.add(val);
            }
        }
        list.add(list2);
    }
    return list;
    }
}