package com.silentanonym.interviewprep.matrix;

import java.util.ArrayList;
import java.util.List;

public class NQueenProblem {

  public void solve(int n) {
    int[][] matrix = new int[n][n];
//    solve(matrix, 0);
//    print(matrix);
    solve(matrix, 0, new ArrayList<>());
  }

  private void print(int[][] matrix) {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[0].length; col++) {
        System.out.print(" " + matrix[row][col] + " ");
      }
      System.out.println("");
    }
  }

  private boolean solve(int[][] matrix, int col) {
    if (col >= matrix.length) {
      print(matrix);
      return true;
    }

    for (int row = 0; row < matrix.length; row++) {
      if (isSafe(matrix, row, col)) {
        matrix[row][col] = 1;

        if (solve(matrix, col + 1)) {
          return true;
        }

        matrix[row][col] = 0;
      }
    }
    return false;
  }

  private boolean isSafe(int[][] matrix, int row, int col) {
    int rowIndex, colIndex;

    for (colIndex = 0; colIndex < col; colIndex++) {
      if (matrix[row][colIndex] == 1) {
        return false;
      }
    }

    for (rowIndex = row, colIndex = col; rowIndex >= 0 && colIndex >= 0; rowIndex--, colIndex--) {
      if (matrix[rowIndex][colIndex] == 1) {
        return false;
      }
    }

    for (rowIndex = row, colIndex = col; rowIndex < matrix.length && colIndex >= 0;
        rowIndex++, colIndex--) {
      if (matrix[rowIndex][colIndex] == 1) {
        return false;
      }
    }

    return true;
  }

  private void solve(int[][] matrix, int col, List<Integer> list) {
    if (col >= matrix.length) {
      print(matrix);
      return;
    }

    for (int row = 0; row < matrix.length; row++) {
      if (isSafe(matrix, row, col)) {
        matrix[row][col] = 1;

        solve(matrix, col + 1, list);

        matrix[row][col] = 0;
      }
    }
  }
}
