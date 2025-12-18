class Solution {
    public long getDescentPeriods(int[] prices) {
        long result = 1;
        int count = 1;
        int n = prices.length;

        for(int i = 1; i < n; i++) {
            if(prices[i - 1] - prices[i] == 1) {
                count++;
            } else {
                count = 1;
            }
            result += count;
        }
        return result;
    }
}