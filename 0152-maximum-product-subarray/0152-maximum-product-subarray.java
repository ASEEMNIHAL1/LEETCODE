class Solution {
    public int maxProduct(int[] nums) {
        // int n = nums.length;
        // int maximum = 0;
        // if(n == 1) {
        //     return nums[n-1];
        // }
        // for(int i = 0;i < n;i++) {
        //     int pro = 1;
        //     for(int j = i;j < n;j++){
        //         pro = pro * nums[j];
        //         maximum = Math.max(maximum,pro);
        //     }
        // }
        // return maximum;

        int pre = 1 , suf = 1 ;
        int maxi = 0;
        int n = nums.length;
        if(n == 1) {
            return nums[n-1];
        }
        for(int i = 0;i<n;i++) {
            if(pre == 0) pre = 1;
            if(suf == 0) suf = 1;
            pre = pre * nums[i];
            suf = suf * nums[n - i - 1];

            maxi = Math.max(maxi,Math.max(pre,suf));
        }
        return maxi;

    }
}