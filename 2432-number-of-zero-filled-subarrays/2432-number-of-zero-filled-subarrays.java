class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // int n = nums.length;
        // long result = 0;
        // int i = 0;
        // while(i < n) {
        //     int l = 0;
        //     if(nums[i] == 0) {
        //         while(i<n && nums[i] == 0) {
        //             i++;
        //             l++;
        //         }
        //     } else {
        //         i++;
        //     }
        //     result += (l) * (l + 1) / 2;
        // }
        // return result;


        long result = 0;
        long count = 0;
        for(int num : nums) {
            if(num == 0){
                count++;
                result += count;
            } else {
                count = 0;
            }
        }
        return result;
    }
}