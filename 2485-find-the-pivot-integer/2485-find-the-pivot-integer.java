class Solution {
    public int pivotInteger(int n) {
      if(n == 1) return 1;

      int total = n * (n + 1) / 2;

      int x = (int)Math.sqrt(total);

      if(x * x == total) {
        return x;
      }

      return -1;
        
    }
}