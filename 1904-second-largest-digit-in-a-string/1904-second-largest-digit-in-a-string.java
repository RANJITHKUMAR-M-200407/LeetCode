class Solution {
    public int secondHighest(String s) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                list.add((int)(s.charAt(i))-48);
            }
        }
        Collections.sort(list);
       for(int i=list.size()-1;i>0;i--)
       {
       if(list.get(i)>list.get(i-1))
       {
        return list.get(i-1);
       }
       }
       return -1;
    }
}