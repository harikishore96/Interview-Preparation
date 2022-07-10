package com.silentanonym.interviewprep.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DiagonalTraverseTest {

  DiagonalTraverse diagonalTraverse = new DiagonalTraverse();

  @Test
  void findDiagonalOrder() {
    int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[] expected = {1, 2, 4, 7, 5, 3, 6, 8, 9};
    int[] actual = diagonalTraverse.findDiagonalOrder(mat);
    Assertions.assertArrayEquals(expected, actual);
  }
}
