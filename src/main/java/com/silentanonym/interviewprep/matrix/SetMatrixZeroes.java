package com.silentanonym.interviewprep.matrix;

public class SetMatrixZeroes {

  public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    int[][] matrixCopy = new int[m][n];

    for (int i = 0; i < m; i++) {
      matrixCopy[i] = matrix[i].clone();
    }

    for (int row = 0; row < m; row++) {
      for (int col = 0; col < n; col++) {
        if (matrixCopy[row][col] == 0) {

          for (int rowIndex = 0; rowIndex < m; rowIndex++) {
            matrix[rowIndex][col] = 0;
          }

          for (int colIndex = 0; colIndex < n; colIndex++) {
            matrix[row][colIndex] = 0;
          }
        }
      }
    }
  }
}
