class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int effective = k % n;
        if(effective == 0) return true;

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n ; j++) {
                int newPos;

                if (i % 2 == 0) {
                    newPos = (j - effective + n) % n; 
                } else {
                    newPos = (j + effective) % n;
                }
                matrix[i][newPos] = mat[i][j];
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] != matrix[i][j]) return false;
            }
        }
        return true;
    }
}