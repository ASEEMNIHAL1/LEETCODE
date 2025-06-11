class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int i = 0;
        int temp;
        for(i = 0;i<nums.length;i++) {
            if(nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
    }
}