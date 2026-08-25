class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;

        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (matrix[mid][0] <= target &&
                    target <= matrix[mid][matrix[mid].length - 1]) {

                int rowLeft = 0;
                int rowRight = matrix[mid].length - 1;

                while (rowLeft <= rowRight) {

                    int rowMid = rowLeft +
                            (rowRight - rowLeft) / 2;

                    if (matrix[mid][rowMid] == target) {
                        return true;
                    } else if (matrix[mid][rowMid] < target) {
                        rowLeft = rowMid + 1;
                    } else {
                        rowRight = rowMid - 1;
                    }
                }

                return false;
            } 
            else if (matrix[mid][matrix[mid].length - 1] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
