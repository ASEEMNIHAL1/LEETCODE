class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> s = new ArrayDeque<>();
        int res = 0;
        for(int a : nums) {
            while(!s.isEmpty() && s.peek() > a) {
                s.pop();
            }

            if(a == 0) {
                continue;
            }

            if(s.isEmpty() || s.peek() < a) {
                res++;
                s.push(a);
            }
        }
        return res;
    }
}