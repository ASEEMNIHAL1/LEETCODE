class Solution {
    public int maxOperations(String s) {
        int n = s.length();
        int result = 0;
        int i = 0;
        int count1 = 0;

        while(i < n) {
            if(s.charAt(i) == '0') {
                result += count1;
                while(i < n && s.charAt(i) == '0') {
                    i++;
                }
            }else{
                count1++;
                i++;
            }
        }

        return result;
    }
}