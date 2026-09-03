 
/*
 Key Words:  not contain any duplicate triplets., any order., return all the triplets, all distinct.

 EDGE/CONS/CLAR
 Not sorted, 
 can contain no solution
 can have negetives
 can be empty
 can be returned in any order


 DISSECT
  nums = [-1,0,1,2,-1,-4] 0 + 2 + -1 = -1
           ^.   
                 ^. 
                    ^.  
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    nums = [-1,0,1,2,-1,-4]
             ^.^.^.  
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.  

     nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.

  Details: p1 < p2 < p3, this never breaks
         
  
   PSEUDO 
   result arrayList
   sort nums 

   for until i = 0 < nums length:
        
        if i > 0 AND nums[i] == nums[i - 1]
            continue
        
        left = i + 1
        right = last index of nums


        while left < right:
           
           sum = num[i] + nums[left] + nums[right]
            if nums at i + left + right == 0
                add new arrayList [i, left, right]
                left+1
                right-1

                while left < right AND nums[left] == nums[left - 1]
                    left+1

                while left < right AND nums[right] == nums[right + 1]
                    right-1
           
            else if nums at i + left + right < 0
                move left+1
           
            else nums at i + left + right > 0
                move right-1
 
   return result 

*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
               int sum = nums[i] + nums[left] + nums[right];

               if(sum > 0){
                right--;
               } 
               else if(sum < 0){
                left++;
               }
               else{
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;

                while(left < right && nums[left] == nums[left-1]){
                    left++;
                }
                while(left < right && nums[right] == nums[right+1]){
                    right--;
                }

               }


            }
        }

        return result;
    }
}
