class Solution {
    public double myPow(double x, int n) {
        // double res = Math.pow(x,n);
        // return res;

        long N = n;
        if(N < 0) {
            x = 1 / x;
            N = -N;
        }
        return fastPow(x , N);
    }

    double fastPow(double x, long n) {
        if(n == 0) return 1.0;

        double half = fastPow(x , n / 2);

        if(n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}