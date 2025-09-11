class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transpose = new int[columns][rows];

        for(int i = 0; i < columns; i++) {
            for(int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }
}