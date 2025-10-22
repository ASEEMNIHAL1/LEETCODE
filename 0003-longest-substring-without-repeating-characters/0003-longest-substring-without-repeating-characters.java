class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charFreq = new int[128];

        int maxLen = 0;
        int stringLen = s.length();
        int left = 0;

        for(int i = 0 ; i < stringLen; i++){
            char curr = s.charAt(i);

            charFreq[curr]++;

            while(charFreq[curr] > 1) {
                charFreq[s.charAt(left)]--;
                left++;
            }
            maxLen = Math.max(maxLen,i - left + 1);
        }
        return maxLen;
    }
}