 
/*
 Key Words: two bars to form a container., maximum amount, maxArea

 DISSECT:
 height = [1,7,2,5,4,7,3,6]
  7 and 6 were chosen
  6 is the min of the container to it represents how tall of water the "Container" can hold

  distance of indicies between them is 6 

  to calculate how much water we can contain between them is to find the Area

  L * W = A

  6 * 6 = 36

  Found Answer

  WHAT/HOW/WHY

  Two Pointers, One on Each end, We need to keep calculating the distance and min height between each pointer - Multiply - and have a solution from that instance

When to Move the pointer, move the pointer that is smallest so we have a higher chance of finding a bigger cantianer 

while left < right

  MaxArea / current tracker, we need to hold are calculations and pair them with the old 
  to find our best container




  WALKTHROUGH:
  height = [1,7,2,5,4,7,3,6]

   left = 0
   right = 7
   max = 0 (lowest)

   1, 6 min = 1
   distance 7 - 0 = 7

   1 * 7 = 7 
   current = 7

   if [left] > [right] right--
   if [left] < [right] left++

   left = 1
   right = 7

   max (7,0) = 7 
   max = 7

   7,6 min = 6
   7 - 1 = 6

   6 * 6 = 36 current

   move right up 
   right = 6
   left = 1
    max = 36

    min = 3
    distance = 5
    5 * 3 = 15 current
    right = 5
    left = 1
    max stays 36

    min = 7
    5 -1 = 4

    4 * 5 = 20

    right = 4
    left = 1

    3 * 4 = 12
    
    right = 3
    left = 1

    2 * 5 = 10

    r = 2
    l = 1

    1 * 1 = 1

    r = 1
    l = 1

    we will stop the loop once r and l are equal 

    so as long as left < right continue so we dont measure incorrectly



    PSEUDO 
    
    right = last index
    left = 0
    maxArea = 0
    while left < right
        current = min of [left], [right] * right - left

        if [left] > [right] 
            right--
        
        if [left] < [right] 
            left++

        maxArea = max of current , maxArea

    
    return maxArea
*/
class Solution {
    public int maxArea(int[] heights) {
        int right = heights.length -1;

        int left = 0;

        int max = 0;

        while(left < right){
            int current = Math.min(heights[left], heights[right]) * (right - left);

            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }

            max = Math.max(current, max);

        }

        return max;
    }
}


