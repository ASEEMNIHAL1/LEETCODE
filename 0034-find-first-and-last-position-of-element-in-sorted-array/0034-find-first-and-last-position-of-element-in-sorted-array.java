class Solution {
    int findfirst(int[] nums,int target,int n) {
        int low = 0 , high = n - 1;
        int first_position = -1;

       
        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                first_position = mid;
                high = mid - 1;
            } else if(nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first_position;
    }

    int findlast(int[] nums,int target,int n) {
        int low = 0 , high = n - 1;
        int last_position = -1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                last_position = mid;
                low = mid + 1;
            }else if(nums[mid] < target) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return last_position;
    }


    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int first_position = findfirst(nums,target,n);
        int last_position = findlast(nums,target,n);

        return new int[]{first_position,last_position};
    }
}