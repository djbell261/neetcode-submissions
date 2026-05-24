class Solution {
    public boolean isPalindrome(String s) {
         
        String phrase = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = phrase.length() -1;

        while(left < right){
            if(phrase.charAt(left) != phrase.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
