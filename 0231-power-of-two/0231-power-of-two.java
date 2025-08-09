class Solution {
    public boolean isPowerOfTwo(int n) {
         if(n>1 && n%2!=0)
        {
            return false;
        }
        for (int i = 0; i < 31; i++) {
            if(Math.pow(2, i)==n)
            {
                return true;
            }
        }
        return false;
    }
}