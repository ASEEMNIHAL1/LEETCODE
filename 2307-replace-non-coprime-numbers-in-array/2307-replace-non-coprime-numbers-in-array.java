class Solution {
    public int  gcd(int a, int b) {
        if(a == 0){
            return b;
        }
        return gcd(b % a,a);
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();
        for(int currNum : nums) {
            stack.add(currNum);
            while(stack.size() > 1) {
                int a = stack.get(stack.size() - 1);
                int b = stack.get(stack.size() - 2);
                int g = gcd(a , b);

                if(g == 1) break;
                stack.remove(stack.size() - 1);
                stack.set(stack.size() - 1 , (int)((long) a * b / g));
            }
        }
        return stack;
    }
}