class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalapples = 0;
        int n = apple.length;
        for(int i = 0; i < n; i++){
            totalapples += apple[i];
        }
        Arrays.sort(capacity);

        int boxUsed = 0;

        for(int j = capacity.length - 1; j >= 0; j--){
            totalapples -= capacity[j];
            boxUsed++;


            if(totalapples <= 0) {
                return boxUsed;
            }
        }
        return boxUsed;
    }
}