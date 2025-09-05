class Solution {
public:
    int countSetBits(long long n) {
        int count = 0;
        while (n) {
            count += n & 1; // Add 1 if the last bit is set
            n >>= 1;        // Right shift by 1
        }
        return count;
    }

    int makeTheIntegerZero(int num1, int num2) {
        int ops = 1;
        while(true){
            long long val = (long long)num1 - (long long)ops*num2;
            if (val<0) return -1;
            if(countSetBits(val) <= ops && ops<=val) return ops;
            ops++;
            
        }
        return -1;
        
    }
};