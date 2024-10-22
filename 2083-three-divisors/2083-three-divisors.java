class Solution {
    public boolean isThree(int n) {
      int count=0;
        for(int i=1;i<=n;i++)
        {
            for (int j = 1; j <= n; j++) {
                if(n==i*j)
                {
                    count++;
                }
            }
        }
        if(count==3)
        {
            return true;
        }
        return false;  
    }
}