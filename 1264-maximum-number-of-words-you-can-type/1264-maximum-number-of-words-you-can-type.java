class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] brokenarray = brokenLetters.split("");
        String[] textArray = text.split(" ");
        int count = textArray.length;

        if(brokenLetters.equals("")) {
            return count;
        }else {
            for(int i=0;i<textArray.length;i++) {
                for(int j=0;j<brokenarray.length;j++){
                    if(textArray[i].contains(brokenarray[j])) {
                        count--;
                        break;
                    }
                }
            }
            return count;
        }
    }
}