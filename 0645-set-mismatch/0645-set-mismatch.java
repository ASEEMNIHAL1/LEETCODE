class Solution {
    public int[] findErrorNums(int[] nums) {
        // int n = nums.length;
        // int freq[] = new int[n+1];
        // for(int val : nums) {
        //     freq[val]++;
        // }

        // int a = 0, b = 0;

        // for(int i = 0 ; i <= n; i++){
        //     if(freq[i] == 2) {
        //         a = i;
        //     } else if(freq[i] == 0) {
        //         b = i;
        //     }
        // }
        // return new int[]{a,b};

        Map<Integer,Integer> map = new HashMap<>();
        for(int val : nums) {
            map.put(val,map.getOrDefault(val, 0) + 1);
        }

        int missing = 0 , duplicate = 0;

        for(int i = 1; i <= nums.length; i++) {
            if(!map.containsKey(i)) {
                missing = i;
            } else if( map.get(i) == 2) {
                duplicate = i;
            }
        }
        return new int[]{duplicate,missing};
    }
}