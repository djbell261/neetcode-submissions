class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        PriorityQueue<Integer> pQ = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );

        for(int key : map.keySet()){
            pQ.offer(key);
        }

        int[] arr = new int[k];
        for(int i=0; i < k; i++){
            arr[i] = pQ.poll();
        }

        return arr;

        
    }
}

//Return the most frequent k Integers in nums
//HashMap to find to track the amount of times each integer appeared in the array,
// Create new array (result) and set size to k
// use a for each to get values, (This part is still confusing)
// the a for loop to i < k or result[].length then using .getKey(value) and store in the new array
// return result
