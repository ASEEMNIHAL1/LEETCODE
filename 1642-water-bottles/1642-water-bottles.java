class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;

        while(numBottles >= numExchange) {
            totalBottles++;

            numBottles = numBottles - (numExchange - 1);
        }
        return totalBottles;
    }
}