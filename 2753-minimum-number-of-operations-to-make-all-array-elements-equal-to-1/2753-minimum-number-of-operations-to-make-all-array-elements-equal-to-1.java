class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 1) {
                count++;
            }
        }
        if(count > 0) {
            return n - count;
        }

        
        int minStepTo1 = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int GCD = nums[i];
            for(int j= i+1; j<n;j++) {
                GCD = gcd(GCD,nums[j]);

                if(GCD == 1) {
                    minStepTo1 = Math.min(minStepTo1, j-i);
                    break;
                }
            }
        }

        if(minStepTo1 == Integer.MAX_VALUE) {
            return -1;
        }
        return minStepTo1 + (n - 1);

    }

    public int gcd(int a,int b) {
            if(b == 0) {
                return a;
            }
            return gcd(b, a%b);
        }
}