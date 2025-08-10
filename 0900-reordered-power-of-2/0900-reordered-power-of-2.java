class Solution {
    // Creates a "signature" for the digits of n
    private String digitCount(int n) {
        int[] cnt = new int[10];
        while (n > 0) {
            cnt[n % 10]++;
            n /= 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int c : cnt) sb.append(c);
        return sb.toString();
    }

    public boolean reorderedPowerOf2(int n) {
        String target = digitCount(n);
        for (int i = 0; i < 31; i++) { // 2^30 < 10^9
            if (digitCount(1 << i).equals(target)) return true;
        }
        return false;
    }
}
