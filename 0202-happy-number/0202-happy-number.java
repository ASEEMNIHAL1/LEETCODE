class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> res = new HashSet<>();
        while(true) {
            n = numSquare(n);
            if(n == 1){
                return true;
            }
            if(res.contains(n)) {
                return false;
            }
            res.add(n);
        }
    }


    public int numSquare(int n) {
        int num = 0;
        while(n != 0) {
            int digit = n % 10;
            num += digit * digit;
            n /= 10;
        }
        return num;
    }
}