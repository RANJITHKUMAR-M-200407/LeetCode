class Solution {
    public int findPermutationDifference(String s, String t) {
        char[]a=s.toCharArray();
        char[]b=t.toCharArray();
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==(b[j]))
                {
                 sum=sum+Math.abs((i-j));
                }
            }
        }
        return sum;
    }
}