package com.silentanonym.interviewprep.matrix;

import org.junit.jupiter.api.Test;

class MatrixIterationTest {

  MatrixIteration matrixIteration = new MatrixIteration();

  @Test
  void rowWiseIteration() {
    int[][] matrix = {
        {0, 1, 2, 3},
        {4, 5, 6, 7},
        {8, 9, 10, 11},
        {12, 13, 14, 15}
    };
    matrixIteration.rowWiseIteration(matrix);
  }

  @Test
  void indexWiseIteration() {
    int[][] matrix = {
        {0, 1, 2, 3},
        {4, 5, 6, 7},
        {8, 9, 10, 11},
        {12, 13, 14, 15}
    };
    matrixIteration.indexWiseIteration(matrix);
  }
}
