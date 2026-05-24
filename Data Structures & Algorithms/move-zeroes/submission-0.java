class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; 
        for(int i=0; i < nums.length; i++){ 
            if(nums[i] != 0){ 
                nums[j] = nums[i]; 
                j++; 
            } 
        } 
        while(j < nums.length) { 
            nums[j] = 0; j++; 
        }
    }
}
// inplace no extra array
// What will I need:
// Two pointers, one pointer only tracks zeros the other everything else
// for loop
// Swapping? scanner pointer will swap with 0Op(not zero pointer)
// increment 0Op when is on a non zero number,
 