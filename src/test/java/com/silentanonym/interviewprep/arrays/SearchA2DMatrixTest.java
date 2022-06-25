package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchA2DMatrixTest {

    SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();
    MatrixBinarySearch matrixBinarySearch = new MatrixBinarySearch();

    @Test
    void searchMatrix() {

        int[][] matrix = new int[][]{
                new int[]{1, 3, 5, 7},
                new int[]{10, 11, 16, 20},
                new int[]{23, 30, 34, 60}
        };
        Assertions.assertTrue(searchA2DMatrix.searchMatrix(matrix, 3));
        Assertions.assertFalse(searchA2DMatrix.searchMatrix(matrix, 13));
    }

    @Test
    void matrixBinarySearch() {

        int[][] matrix = new int[][]{
                new int[]{1, 3, 5, 7},
                new int[]{10, 11, 16, 20},
                new int[]{23, 30, 34, 60}
        };
        Assertions.assertTrue(matrixBinarySearch.search(matrix, 3));
        Assertions.assertFalse(matrixBinarySearch.search(matrix, 13));
    }
}
