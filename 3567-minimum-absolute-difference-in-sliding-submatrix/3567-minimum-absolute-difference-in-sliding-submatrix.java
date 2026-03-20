class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n - k + 1][m - k + 1];
        for (int i = 0; i <= n - k; i++) {
            for (int j = 0; j <= m - k; j++) {

                List<Integer> list = new ArrayList<>();

                for (int r = i; r < i + k; r++) {
                    for (int c = j; c < j + k; c++) {
                        list.add(grid[r][c]);
                    }
                }
                Collections.sort(list);

                int minDiff = Integer.MAX_VALUE;
                for (int x = 1; x < list.size(); x++) {
                    if (!list.get(x).equals(list.get(x - 1))) {
                        minDiff = Math.min(minDiff, list.get(x) - list.get(x - 1));
                    }
                }

                ans[i][j] = (minDiff == Integer.MAX_VALUE) ? 0 : minDiff;

            }
        }
        return ans;
    }
}