class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        // for(int i = 0 ; i < k / 2; i++) {
        //     int topRow = x + i;
        //     int bottomRow = x + k - 1 - i;

        //     for(int j = 0 ; j < k; j++) {
        //         int col = y + j;

        //         int temp = grid[topRow][col];
        //         grid[topRow][col] = grid[bottomRow][col];
        //         grid[bottomRow][col] = temp;
        //     }
        // }

        // return grid;

        int top = x;
        int bottom = x + k - 1;

        while(top < bottom){
            for(int i = y ; i < y + k; i++){
                int temp = grid[top][i];
                grid[top][i] = grid[bottom][i];
                grid[bottom][i] = temp;
            }

            top++;
            bottom--;
        }
        return grid;
    }
}