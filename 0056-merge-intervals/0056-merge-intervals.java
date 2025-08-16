class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length == 0) return new int[0][];
        Arrays.sort(intervals, (a , b) -> Integer.compare(a[0],b[0]));

        List<int[]> ans = new ArrayList<>();
        int[] curr = intervals[0];
        ans.add(curr);

        for(int[] interval : intervals) {
            if(interval[0] <= curr[1]) {
                //overlap 
                curr[1] = Math.max(curr[1],interval[1]);
            }
            else {
                //no overlap
                curr = interval;
                ans.add(curr);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}