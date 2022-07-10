package com.silentanonym.interviewprep.matrix;

public class MatrixIteration {

  public void rowWiseIteration(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length; col++) {
        System.out.print(matrix[row][col] + " ");
      }
    }
  }

  public void indexWiseIteration(int[][] matrix) {
    for (int index = 0; index < matrix.length * matrix[0].length; index++) {
      int row = index / matrix[0].length;
      int col = index % matrix[0].length;
      System.out.print(matrix[row][col] + " ");
    }
  }
}
