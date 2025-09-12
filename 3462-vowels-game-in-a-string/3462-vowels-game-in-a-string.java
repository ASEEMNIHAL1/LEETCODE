class Solution {
    public boolean doesAliceWin(String s) {
        // String vowels = "aeiou";

        // for(int i = 0; i < s.length(); i++) {
        //     char current = s.charAt(i);

        //     if(vowels.indexOf(current) != -1) {
        //         return true;
        //     }
        // }
        // return false;

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            switch(current) {
                case 'a','e','i','o','u' : 
                return true;
            }
        }
        return false;

    }
}