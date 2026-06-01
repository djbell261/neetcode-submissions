class Solution {
    public int[] productExceptSelf(int[] nums) {
      
        int[] result = new int[nums.length];
        int prefix = 1;

        for(int i=0; i < nums.length; i++){
            result[i] = prefix; // 1 1 2 8
            prefix *= nums[i];// 1 2 8

        }

        int postfix = 1;

        for(int i=nums.length-1; i >= 0; i--){
            result[i] *= postfix; // 8 * 1 2 * 6 2 * 24 1 * 48
            postfix *= nums[i];   // 1 * 6  6 * 4  24 * 2             
        }
        
      
       return result;
    }

}   
// 1 2 4 6
// 2 * 4 * 6 = 48
// 1 * 4 * 6 = 24
// 1 * 2 * 6 = 12
// 1 * 2 * 4 = 8

//48 24 12 8

//48, 24 , 6, 1 
//.48, 24, 12, 8 