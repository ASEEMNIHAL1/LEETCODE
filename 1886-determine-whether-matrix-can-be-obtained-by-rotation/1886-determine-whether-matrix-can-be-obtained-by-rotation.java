class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        boolean[] c = new boolean[4]; // Flags for 0, 90, 180, 270 degrees
        Arrays.fill(c, true);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Check 0°: Standard equality
                if (mat[i][j] != target[i][j])
                    c[0] = false;

                // Check 90° clockwise: (i, j) maps to (j, n-1-i)
                if (mat[i][j] != target[j][n - 1 - i])
                    c[1] = false;

                // Check 180° clockwise: (i, j) maps to (n-1-i, n-1-j)
                if (mat[i][j] != target[n - 1 - i][n - 1 - j])
                    c[2] = false;

                // Check 270° clockwise: (i, j) maps to (n-1-j, i)
                if (mat[i][j] != target[n - 1 - j][i])
                    c[3] = false;
            }
        }

        // If any rotation is still possible, return true
        return c[0] || c[1] || c[2] || c[3];
    }
}