class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int pre = 0, cnt = 0;

        for(int num:nums){
            pre += num;
            int remove = pre - k;
            cnt += mpp.getOrDefault(remove,0);
            mpp.put(pre, mpp.getOrDefault(pre,0) + 1);
        }
        return cnt;
    }
}