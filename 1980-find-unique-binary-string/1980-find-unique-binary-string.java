class Solution {
    public String findDifferentBinaryString(String[] nums) {
        // int n = nums.length;
        // Set<Integer> set = new HashSet<>();

        // for(String s : nums) {
        //     set.add(Integer.parseInt(s,2));
        // }

        // for(int i = 0; i <= n; i++){
        //     if(!set.contains(i)){
        //         String binary = Integer.toBinaryString(i);

        //         StringBuilder res = new StringBuilder();
        //         while(res.length() < n - binary.length()) {
        //             res.append('0');
        //         }
        //         return res.append(binary).toString();
        //     }
        // }
        // return "";

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < nums.length; i++) {
            res.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }

        return res.toString();
    }
}