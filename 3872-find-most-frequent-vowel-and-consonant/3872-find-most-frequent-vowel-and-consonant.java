class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        String vowels = "aeiou";
        int maxVowels = 0 , maxConso = 0;
        char[] chars = s.toCharArray();
        for(char ch : chars) {
            int idx = ch - 'a';
            freq[idx]++;
            if(vowels.indexOf(ch) >= 0) {
                maxVowels = Math.max(maxVowels, freq[idx]);
            }else {
                maxConso = Math.max(maxConso, freq[idx]);
            }
        }
        return maxVowels + maxConso;
    }
}