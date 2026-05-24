class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); // Sort both Integer arrays
        Arrays.sort(nums2);

        HashSet<Integer> result = new HashSet<>(); // Create hashset to store both of the numbers (Uniques only)

        int i = 0; // Two pointers
        int j = 0;

        while (i < nums1.length && j < nums2.length) { // while i and j havent reached the end of their arrays keep looping. 

            if (nums1[i] == nums2[j]) { // if number at given i index equals j index  add number to set
                result.add(nums1[i]);
                i++; // go to the next number
                j++;
            } 
            else if (nums1[i] < nums2[j]) { // if number at i < number at j, 
            // we know its not the same number and i's next #s index could be equal to j so add 1 to i
                i++;
            } 
            else { // in reverse for j
                j++;
            }
        }

        int[] arr = new int[result.size()]; // after having the size of the final hashset create a new array with that
        int k = 0; // counter var acts as index
        for (int num : result) { // for loop to grab each number in result and put it in the array
            arr[k] = num;
            k++;  // count k up after every loop so we properly add numbers to each index in the array 
        }

        return arr; // return final array with unique numbers from result
    }
}