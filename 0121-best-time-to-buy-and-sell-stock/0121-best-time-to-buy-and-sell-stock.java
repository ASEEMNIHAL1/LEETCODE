class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minP = Integer.MAX_VALUE;
        int n = prices.length;
        for(int i = 0;i<n;i++){
            minP = Math.min(minP,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i] - minP);
        }
        return maxProfit;
    }
}