package com.silentanonym.interviewprep.arrays;

public class MatrixBinarySearch {

    public boolean search(int[][] matrix, int target) {
        return binarySearch(matrix, target) != -1;
    }

    // rows X columns - 3 X 4
    // Formula,
    //  Row index    = Flat array position / No. of columns
    //  Column index = Flat array position % No. of columns
    // Flat array position    - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
    // Row index (/)          - 0, 0, 0, 0, 1, 1, 1, 1, 2, 2,  2,  2
    // Column index (%)       - 0, 1, 2, 3, 0, 1, 2, 3, 0, 1,  2,  3
    public int binarySearch(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int low = 0;
        int high = (rows * columns) - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (matrix[low / columns][low % columns] == target) return low;
            if (matrix[high / columns][high % columns] == target) return high;
            if (matrix[mid / columns][mid % columns] == target) return mid;

            if (target < matrix[mid / columns][mid % columns]) {
                // Search Left Part
                high = mid - 1;
            } else {
                // Search Right Part
                low = mid + 1;
            }
        }
        return -1;
    }
}
