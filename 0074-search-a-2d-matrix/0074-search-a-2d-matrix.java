class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows * cols - 1;
        int firstIndex = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if(matrix[row][col] >= target) {
                firstIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if(firstIndex == -1) {
            return false;
        }
        int row = firstIndex / cols;
        int col = firstIndex % cols;
        return matrix[row][col] == target;
    }
}