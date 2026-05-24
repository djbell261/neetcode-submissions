class Solution {
    public boolean canPermutePalindrome(String s) {
   
        HashMap<Character, Integer> map = new HashMap<>();

        int oddCount = 0;


        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Integer value : map.values()) {
            if (!(value % 2 == 0)) {
                oddCount++;
            }

        }

        return oddCount < 2;
    }
}
    //What makes a palindrome?
    //a palindrome can be read the same fowards and backwards
    //also if even as an even number a specific letters
    //if odd has that and only one extra letter
    //Check to see if string has that using a HashMap inside a for loop to loop through the string
    //HashMap<Character, Interger> key is the character and Integer is the amount of times it occured in the string
    // we iterate through all the key's values using a for loop and we check if the values all return even and if odd count is less than 2
    // then we've found a possible palindrome


