class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += grid[i][j];
            }
        }

        if (sum % 2 != 0) {
            return false;
        }

        long target = sum / 2;

        long rowPre = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m; j++) {
                rowPre += grid[i][j];
            }

            if (rowPre == target) {
                return true;
            }
        }

        long colPre = 0;
        for (int j = 0; j < m - 1; j++) {
            for (int i = 0; i < n; i++) {
                colPre += grid[i][j];
            }

            if (colPre == target) return true;

        }

        return false;
    }
}