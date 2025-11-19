class Solution {
    public int findFinalValue(int[] nums, int original) {
    //    boolean found = true;

    //    while(found) {
    //     found = false;
    //     for(int n : nums) {
    //         if(n == original) {
    //             original *= 2;
    //             found = true;
    //             break;
    //         }
    //     }
    //    }
    //    return original;


        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }

        while(set.contains(original)) {
            original *= 2;
        }

        return original;
    }
}