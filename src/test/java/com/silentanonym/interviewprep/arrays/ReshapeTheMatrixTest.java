package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReshapeTheMatrixTest {

    ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();

    @Test
    void matrixReshape() {
        int [][] expected = new int[][]{ { 1,2,3,4 }};
        int[][] actual = reshapeTheMatrix.matrixReshape(new int[][]{{1,2},{3,4}}, 1, 4);
//        System.out.println(Arrays.toString(actual[0]));
        Assertions.assertArrayEquals(expected, actual);
    }
}
