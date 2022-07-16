package com.silentanonym.interviewprep.matrix;

public class RotateImage {

  public void rotate(int[][] matrix) {

    // Transpose
    for (int i = 0; i < matrix.length; i++) {
      for (int j = i; j < matrix.length; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    // Reverse Rows
    for (int i = 0; i < matrix.length; i++) {
      int start = 0, end = matrix[i].length - 1;
      while (start < end) {
        int temp = matrix[i][start];
        matrix[i][start] = matrix[i][end];
        matrix[i][end] = temp;
        ++start;
        --end;
      }
    }
  }
}
