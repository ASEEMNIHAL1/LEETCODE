class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] preX = new int[n+1][m+1];
        int[][] preY = new int[n+1][m+1];
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                preX[i+1][j+1] = preX[i][j+1] + preX[i+1][j] - preX[i][j] + (grid[i][j] == 'X' ? 1 : 0);
                preY[i+1][j+1] = preY[i][j+1] + preY[i+1][j] - preY[i][j] + (grid[i][j] == 'Y' ? 1 : 0);

                if(preX[i+1][j+1] == preY[i+1][j+1] && preX[i+1][j+1] >= 1) {
                    count++;
                }
            }
        }
        return count;
    }
}