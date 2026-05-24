class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int pointer = 0;
        int maxCount = 0;
        for(int i=0; i < s.length(); i++){

            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(pointer));
                pointer++;

            }
            set.add(s.charAt(i));
            maxCount = Math.max(maxCount, set.size());

        }
        return maxCount;
    }
}
//Sliding window
// for loop to iterate over the string's characters
// HashSet to remember characters 
// count var that counts the length gone without dupes
// MaxCount to compare Max count to new count
// if set.contains(charAt(i)) count = 0;
// else count++
// 
//
