package com.silentanonym.interviewprep.matrix;

import org.junit.jupiter.api.Test;

class RotateImageTest {

  RotateImage rotateImage = new RotateImage();

  @Test
  void rotate() {

    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    MatrixUtil.print(matrix);
    rotateImage.rotate(matrix);
    MatrixUtil.print(matrix);
  }
}
