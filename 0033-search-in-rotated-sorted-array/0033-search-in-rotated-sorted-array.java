class Solution {
    int findPivot(int nums[],int n){
        int l = 0 , r = n-1;
        while(l < r){
            int mid = l + (r - l) / 2;
            if(nums[mid] > nums[r]) {
                l = mid + 1;
            }else {
                r = mid;
            }
        }
        return r;
    }

    int bs(int l,int r,int[] nums,int target){
        int idx = -1;
        while(l <= r) {
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                idx = mid;
                break;
            }else if(nums[mid] < target) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return idx;
    }




    public int search(int[] nums, int target) {
        int n = nums.length;

        int pivot_idx = findPivot(nums,n);

        int idx = bs(0,pivot_idx-1,nums,target);
        if(idx != -1) return idx;
        idx = bs(pivot_idx,n-1,nums,target);
        return idx;

    }
}