class Solution {
    public int hammingWeight(int n) {
        int res = Integer.bitCount(n);
        return res;
    }
}