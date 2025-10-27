class Solution {
    public int numberOfBeams(String[] bank) {
       ArrayList<Integer> list = new ArrayList<>();
       int count=0;
    for(int i=0;i<bank.length;i++)
    {
        count=0;
        String a = bank[i];
        for(int j=0;j<a.length();j++)
        {
            if(a.charAt(j)=='1')  count++;
        }
        if(count>0)  list.add(count);
    } 
    if(list.size()<=1) return 0;
    int sum=0;
    for(int i=0;i<list.size()-1;i++)
    {
     sum+=(list.get(i)*list.get(i+1));   
    }
   // System.out.print(list);
    return sum;
    }
}