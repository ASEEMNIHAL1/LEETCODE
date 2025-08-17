class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maximum = 0;
        if(n == 1) {
            return nums[n-1];
        }
        for(int i = 0;i < n;i++) {
            int pro = 1;
            for(int j = i;j < n;j++){
                pro = pro * nums[j];
                maximum = Math.max(maximum,pro);
            }
           // maximum = Math.max(maximum,pro);
        }
        return maximum;
    }
}