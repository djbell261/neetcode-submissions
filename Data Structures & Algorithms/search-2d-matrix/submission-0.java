class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            int midRow = mid / cols;
            int midCol = mid % cols;

            if(matrix[midRow][midCol] > target){
                right = mid - 1;
            }
            else if(matrix[midRow][midCol] < target){
                left = mid + 1;
            }
            else{
                return true;
            }


        }

        return false;



    }
}
// left pointer at the start index 0
// Right pointer at the last index in the matrix
// question is do you want to search each row, OR search the whole matrix from the beginning