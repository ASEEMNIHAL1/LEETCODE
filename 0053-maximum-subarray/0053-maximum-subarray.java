class Solution {
    public int maxSubArray(int[] nums) {
      int msum = nums[0],sum = 0 , n = nums.length;
      for(int i = 0;i<n;i++) 
      {
        sum += nums[i];
        msum = (sum > msum) ? sum : msum;
        sum = (sum < 0) ? 0 : sum;
      }
      return msum;
    }
}