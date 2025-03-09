class Solution {
    public int minimumRecolors(String a, int k) {
        int count=0;
        int min=Integer.MAX_VALUE;
        for (int i = 0; i <=a.length()-k; i++) {
            count=0;
            for (int j = i; j <= (i+k)-1; j++) {
               if(a.charAt(j)=='W') count++;  
            }
            if(count<min)  min=count;
        }
        return min; 
    }
}