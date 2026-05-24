class Solution {
    public int[] productExceptSelf(int[] nums) {
         int[] result = new int[nums.length];

        int prefix = 1; // Starting with prefix set to 1
        for(int i = 0; i < nums.length; i++){ // loop through each number,
            result[i] = prefix; // inside the new array set each index equal to and iteration of our prefix in the beginning
            prefix *= nums[i]; // multiply our current prefix to numbers in our indexes

        }
        // result becomes [1, 1, 2, 8]


        int postfix = 1; // set starting postfix to 1
        for(int i = nums.length-1; i >= 0; i--){ // loop from end to beginning index
            result[i] *= postfix; // 1*8, 2*6, 1*24, 1*48
            postfix *= nums[i]; // 1 * 6, 6*4, 24*2, 48 *1
        }
        // result needs to become
        // [48, 24, 12, 8]


        return result;
    }

}  
//PreFix PostFix
// what does that even mean?
// Calculate all numbers pre said #
// Calculate all #s post said #
// using a for loop maybe multiply 