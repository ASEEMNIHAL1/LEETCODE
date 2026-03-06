class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] freq = new int[size + 1];
        for(int[] row : grid){
            for(int val : row){
                freq[val]++;
            }
        }

        int a = 0, b = 0;

        for(int i = 1; i <= size; i++){
            if(freq[i] == 2) {
                a = i;
            } else if(freq[i] == 0){
                b = i;
            }
        }
        return new int[]{a,b};
    }
}