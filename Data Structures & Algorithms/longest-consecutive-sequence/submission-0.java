class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longestSequence = 0;

        for(Integer num : nums){
            set.add(num);
        }

        for(Integer num : set){
            if(!set.contains(num - 1)){
                int current = num;
                int currentStreak = 1;

                while(set.contains(current + 1)){
                    current++;
                    currentStreak++;
                }

                longestSequence = Math.max(longestSequence, currentStreak);
            }
        }

        return longestSequence;
    }
}
 