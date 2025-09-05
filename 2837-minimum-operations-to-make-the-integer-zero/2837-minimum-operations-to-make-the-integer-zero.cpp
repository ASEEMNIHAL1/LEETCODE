class Solution {
public:
    int makeTheIntegerZero(int num1, int num2) {
        int ops = 1;
        while(true){
            long long val = (long long)num1 - (long long)ops*num2;
            if (val<0) return -1;
            if( __builtin_popcountll(val) <= ops && ops<=val) return ops;
            ops++;
            
        }
        return -1;
        
    }
};