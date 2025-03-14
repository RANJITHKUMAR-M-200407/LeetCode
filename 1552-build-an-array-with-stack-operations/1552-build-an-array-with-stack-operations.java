class Solution {
    public List<String> buildArray(int[] a, int n) {
       int i=1,ind=0;
        ArrayList<String> list = new ArrayList<>();
        while(ind<=a.length-1)
        {
            if(i==a[ind])
            {
                list.add("Push");
                ind++;
            }
            else{
                list.add("Push");
                list.add("Pop");
            }
            i++;
        }
        return list;  
    }
}