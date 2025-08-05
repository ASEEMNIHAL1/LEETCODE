class Solution {
    public int longestConsecutive(int[] nums) {
   if(nums.length == 0) 
   return 0;

   Set<Integer> set = new HashSet<>();
   for(int num : nums) {
    set.add(num);
   }

   int longest = 0;
   for(int num:set) {
    if(!set.contains(num -1)) {
        int currentNum = num;
        int cnt = 1;

        while(set.contains(currentNum + 1)) {
            currentNum += 1;
            cnt += 1;
        }
        longest = Math.max(longest,cnt);
    }
   }
   return longest;
}
}