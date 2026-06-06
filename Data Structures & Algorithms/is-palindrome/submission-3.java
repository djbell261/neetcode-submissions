class Solution {
    public boolean isPalindrome(String s) {
       String lowerCase = s.toLowerCase();
       int left = 0;
       int right = lowerCase.length() -1;

       while(left < right){
          while( left < right && !Character.isLetterOrDigit(lowerCase.charAt(left))){
            left++;
          }

          while( left < right && !Character.isLetterOrDigit(lowerCase.charAt(right))){
            right--;
          }
        
         if(lowerCase.charAt(left) != lowerCase.charAt(right)){
            return false;
          }

          left++;
          right--;
       }

       return true;
    }
}



//Clues forward and backward.
// Palindrome
// "wasitacaroracatisaw" ignore spacing

//Pattern Two Pointers
//One starts at the start of the string the other at the end
//compare every character at each index ignoring the " " or non letters
//If both places have != characters then return false if not continue mmoving closer together
//keep moving while left pointer is less than right pointer.
// return true after this operation is complete bc then we know that this is a palindrome

//Run Time Time O(n) Space O(1) because we iterate through the entire string once and our variables dont grow as input grows