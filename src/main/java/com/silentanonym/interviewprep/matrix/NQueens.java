package com.silentanonym.interviewprep.matrix;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

  public List<List<String>> solveNQueens(int n) {
    List<List<String>> answer = new ArrayList<>();
    char[][] board = new char[n][n];
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        board[row][col] = '.';
      }
    }
    solve(board, 0, answer);
    return answer;
  }

  private void solve(char[][] board, int col, List<List<String>> answer) {

    if (col >= board.length) {
      List<String> rowAnswer = new ArrayList<>();
      for (int rowIndex = 0; rowIndex < board.length; rowIndex++) {
        rowAnswer.add(new String(board[rowIndex]));
      }
      answer.add(rowAnswer);
      return;
    }

    for (int row = 0; row < board.length; row++) {
      if (isSafe(board, row, col)) {
        board[row][col] = 'Q';
        solve(board, col + 1, answer);
        board[row][col] = '.';
      }
    }
  }

  private boolean isSafe(char[][] board, int row, int col) {
    for (int colIndex = 0; colIndex < col; colIndex++) {
      if (board[row][colIndex] == 'Q') {
        return false;
      }
    }

    for (int rowIndex = row, colIndex = col; rowIndex >= 0 && colIndex >= 0;
        rowIndex--, colIndex--) {
      if (board[rowIndex][colIndex] == 'Q') {
        return false;
      }
    }

    for (int rowIndex = row, colIndex = col; rowIndex < board.length && colIndex >= 0;
        rowIndex++, colIndex--) {
      if (board[rowIndex][colIndex] == 'Q') {
        return false;
      }
    }

    return true;
  }
}
