package com.silentanonym.interviewprep.matrix;

import org.junit.jupiter.api.Test;

class NQueensTest {

  NQueens nQueens = new NQueens();

  @Test
  void solveNQueens() {
    System.out.println(nQueens.solveNQueens(4));
  }
}
