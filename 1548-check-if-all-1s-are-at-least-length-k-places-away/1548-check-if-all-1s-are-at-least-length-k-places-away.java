class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = -(k + 1);

        for(int curr = 0; curr < nums.length;curr++) {
            if(nums[curr] == 1) {
                if(curr - prev - 1 < k) {
                    return false;
                }
                prev = curr;
            }
        }

        return true;
    }
}