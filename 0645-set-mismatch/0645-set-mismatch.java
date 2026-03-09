class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int freq[] = new int[n+1];
        for(int val : nums) {
            freq[val]++;
        }

        int a = 0, b = 0;

        for(int i = 0 ; i <= n; i++){
            if(freq[i] == 2) {
                a = i;
            } else if(freq[i] == 0) {
                b = i;
            }
        }
        return new int[]{a,b};
    }
}