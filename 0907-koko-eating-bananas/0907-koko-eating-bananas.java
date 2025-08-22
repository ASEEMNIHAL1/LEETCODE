class Solution {
    int findmax(int[] piles) {
        int maxi = 0;
        int n = piles.length;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,piles[i]);
        }
        return maxi;
    }

    long countfunc(int[] piles,int hr) {
        long total = 0;
        int n = piles.length;
        for(int i = 0;i<n;i++){
            total += (piles[i] + hr - 1) / hr;
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , high = findmax(piles);
        int ans = high;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long total = countfunc(piles,mid);
            if(total <= h) {
                ans = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
}