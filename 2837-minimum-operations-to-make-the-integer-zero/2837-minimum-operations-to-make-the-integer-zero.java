class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int i = 1; ; i++) {
            long val = (long)num1 - (long)i * num2;

            if(val < 0) {
                return -1;
            }

            if(Long.bitCount(val) <= i && i <= val) {
                return i;
            }
        }
    }
}