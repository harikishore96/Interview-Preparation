package com.silentanonym.interviewprep.matrix;

public class MatrixUtil {

  private MatrixUtil() {
  }

  public static void print(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length; col++) {
        System.out.print(" " + matrix[row][col] + " ");
      }
      System.out.println("");
    }
  }
}
