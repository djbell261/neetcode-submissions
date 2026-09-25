class Solution {
    public int characterReplacement(String s, int k) {
        
        if(s.equals("")){
            return 0;
        }


        int maxFreq =0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;

        for(int end =0; end < s.length(); end++){
            map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0)+1);
            maxFreq = Math.max(map.get(s.charAt(end)), maxFreq);

            while((end - start + 1) - maxFreq > k){
                map.put(s.charAt(start), map.get(s.charAt(start))-1);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
/*
Keywords: Frequency of Characters/Hashmap, SubString/Sliding Window, keep track of current length, Return int max length, keep track that window works even when replace k elements

Hashmap<character, integer>

EDGE/CONS:
empty string, return 0

Approach: using a sliding window algorithm, every time we expand the window check if the add the character to the hashmap / add to frequency. then check if (this character on the end pointer or all characters) inside the hashmap if subtracted by k is less than or equal to 0 map.get(char) - k <= 0, thats when i know i still have a valid window and increase current length+1 else shrink the window and subtract character on the start frequncy in the hashmap until we are valid again. then compare current to max length and replace max with the higher value, and continue exapanding


Dissect:
Input: s = "AAABABB", k = 1
               ^
                  ^
maxLength = 0
maxFeq = 0
int start = 0;
map<character,integer>

for end = 0; end < str length; end++
    map.put()
    maxFreq = map.get()

    while(start - end + 1) - maxFeq > k
        map.put(character, get(character)-1)
        end++

maxLength = maxLength, start - end + 1

*/