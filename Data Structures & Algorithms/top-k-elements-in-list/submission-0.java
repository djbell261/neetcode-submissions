class Solution {
     public int[] topKFrequent(int[] nums, int k) {
           HashMap<Integer, Integer> map = new HashMap<>();
            int[] result = new int[k];

            for(int num : nums){
                map.put(num, map.getOrDefault(num, 0)+1);
            }
            
            // Use a Priority Heap and sort the map keys from Biggest to Smallest values 
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
             (a, b) -> map.get(b) - map.get(a) //Decide which is the value of key is Bigger and make the Heap go biggest to smallest
            );

            for (int number : map.keySet()) { // Loop through all the keys
            maxHeap.offer(number); // put key into the Priority Heap
            }

            for(int i=0; i<k; i++){
                
                result[i] = maxHeap.poll(); // poll to grab the top number in the heap
            }

            return result;
        }
}
//Return the most frequent k Integers in nums
//HashMap to find to track the amount of times each integer appeared in the array,
// Create new array (result) and set size to k
// use a for each to get values, (This part is still confusing)
// the a for loop to i < k or result[].length then using .getKey(value) and store in the new array
// return result
