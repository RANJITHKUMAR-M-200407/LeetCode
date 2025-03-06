class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n; 
        int[] count = new int[N + 1]; 
        int[] ans = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++;
            }
        }


        for (int i = 1; i <= N; i++) {
            if (count[i] == 2) ans[0] = i;
            if (count[i] == 0) ans[1] = i; 
        }

        return ans; 
    }
}