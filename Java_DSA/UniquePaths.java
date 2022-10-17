class Solution {
    public int uniquePaths(int m, int n) {

        int[][] cache = new int[m][n];
        for(int row[]: cache) {
            Arrays.fill(row, -1);
        }

        return sol(m - 1, n - 1, cache);
    }

    private int sol(int r, int c, int[][] cache) {

        if(r == 0 && c == 0) {
            return 1;
        }

        if(r < 0 || c < 0) {
            return 0;
        }

        if(cache[r][c] != -1) {
            return cache[r][c];
        }

        int up = sol(r - 1, c, cache);
        int left = sol(r, c - 1, cache);

        return cache[r][c] = up + left;
    }
}
