class Solution {
    public int minimumOperations(int[] nums) {
        int operation = 0;

        for(int n : nums) {
            int remainder = n % 3;

            if(remainder != 0) {
                operation += Math.min(remainder, 3 - remainder);
            }
        }
        return operation;
    }
}