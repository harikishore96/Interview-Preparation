package com.silentanonym.interviewprep.matrix;

import org.junit.jupiter.api.Test;

class SetMatrixZeroesTest {

  SetMatrixZeroes setMatrixZeroes = new SetMatrixZeroes();

  @Test
  void setZeroes() {

    int[][] matrix = {
        {1, 1, 1}, {1, 0, 1}, {1, 1, 1}
    };
    setMatrixZeroes.setZeroes(matrix);
    print(matrix);
  }

  private void print(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length; col++) {
        System.out.print(" " + matrix[row][col] + " ");
      }
      System.out.println("");
    }
  }
}
