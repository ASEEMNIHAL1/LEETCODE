class Solution {
    
    // Method to count set bits in a long number
    private int countSetBits(long n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public int makeTheIntegerZero(int num1, int num2) {
        int ops = 1;
        while (true) {
            long val = (long) num1 - (long) ops * num2;
            if (val < 0) return -1;
            if (countSetBits(val) <= ops && ops <= val) return ops;
            ops++;
        }
    }
}
