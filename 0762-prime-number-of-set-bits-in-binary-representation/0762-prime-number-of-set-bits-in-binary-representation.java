class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++){
            int val = Integer.bitCount(i);
            boolean flag = isPrime(val);
            if(flag==true) count++;
        }
        return count;

    }
    static boolean isPrime(int n) {
    if (n <= 1) return false;

    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0)
            return false;
    }
    return true;
}
}