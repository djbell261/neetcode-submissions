class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int index1 = 0;
        int index2 = numbers.length -1;


        while(index1 < index2){

            while(numbers[index1] + numbers[index2] > target){
                index2--;
            }
            while(numbers[index1] + numbers[index2] < target){
                index1++;
            }

            if(numbers[index1] + numbers[index2] == target){
                return new int[] {index1 + 1, index2 + 1};
            }

        }

        return new int[] {};

        


         
        


    }
}

// Clues 
//Two indexes add up to target
// Solution must be O(1) so no growing Hashmap or HashSet, Two Pointers in the Array
// Index 1 must be less than Index 2

//Pattern Two Pointers, One Starts in the Beginning, the Other at the end
// 1 + 4 = 5 target 3
// if = more than 