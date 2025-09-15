class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] brokenArray = brokenLetters.split("");
        String[] textArray = text.split(" ");
        int count = textArray.length;

        if(brokenLetters.equals("")) {
            return count;
        }else {
            for(int i = 0;i < textArray.length; i++) {
                
                for(int j = 0;j < brokenArray.length; j++){

                    if(textArray[i].contains(brokenArray[j])) {
                        count--;
                        break;
                    }
                }
            }
            return count;
        }
    }
}