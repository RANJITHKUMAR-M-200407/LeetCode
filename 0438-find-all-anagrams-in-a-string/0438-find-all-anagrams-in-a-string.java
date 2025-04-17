class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       char[]arr = p.toCharArray();
       Arrays.sort(arr);
       ArrayList<Integer> list = new ArrayList<>();
       int num=0;
       int n2=arr.length;
       for(int i=0;i<=s.length()-n2;i++)
       {
        int ind=0;
        char[]ans = new char[n2];
        for(int j=i;j<i+n2;j++)
        {
        ans[ind++]=s.charAt(j);
        }
        Arrays.sort(ans);
        if(Arrays.equals(arr,ans))
        {
            list.add(i);
        }
       }
       return list;
    }
}