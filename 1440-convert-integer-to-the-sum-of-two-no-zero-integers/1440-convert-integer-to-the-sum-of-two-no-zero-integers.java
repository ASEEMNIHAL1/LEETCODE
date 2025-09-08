class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int first = 1; ;first++) {
            int second = n - first;

            String conStr = first + "" + second;

            if(!conStr.contains("0")) {
                return new int[] {first, second};
            }
        }
    }
}