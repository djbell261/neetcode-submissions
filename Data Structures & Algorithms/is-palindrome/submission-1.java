class Solution {
    public boolean isPalindrome(String s) {
        String phrase = s.toLowerCase();
         
        int left = 0;
        int right = phrase.length() -1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(phrase.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(phrase.charAt(right))){
                right--;
            }

            if(phrase.charAt(left) != phrase.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
