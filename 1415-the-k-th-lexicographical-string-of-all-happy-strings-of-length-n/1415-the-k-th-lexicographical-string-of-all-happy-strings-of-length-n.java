class Solution {
    public String getHappyString(int n, int k) {
        List<String> results = new ArrayList<>();
        backtrack(n,k, new StringBuilder(), results);

        return results.size() < k ? "" : results.get(k-1);
    }

    void backtrack(int n, int k, StringBuilder current, List<String> results) {
            if(results.size() == k) return;

            if(current.length() == n) {
                results.add(current.toString());
                return;
            }

            for(char c : new char[]{'a','b','c'}) {
                int len = current.length();



                if(len == 0 || current.charAt(len - 1) != c) {
                    current.append(c);
                    backtrack(n,k,current,results);
                    current.deleteCharAt(len);
                }
          }
    }
}
