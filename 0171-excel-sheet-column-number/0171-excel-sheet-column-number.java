class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for(int i = 0; i < columnTitle.length(); i++) {
            char currChar = columnTitle.charAt(i);

            int currValue = currChar - 'A' + 1;


            result = result * 26 + currValue;
        }

        return result;

    }
}