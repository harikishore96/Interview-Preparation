package com.silentanonym.interviewprep.arrays;

public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) return mat;

        int[][] result = new int[r][c];
        for (int index = 0; index < r * c; index++) {
            result[index / c][index % c] = mat[index / mat[0].length][index % mat[0].length];
        }
        return result;
    }
}
