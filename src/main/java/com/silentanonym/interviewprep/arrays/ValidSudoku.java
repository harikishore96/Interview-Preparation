package com.silentanonym.interviewprep.arrays;

import java.util.HashSet;

public class ValidSudoku {

    // Runtime: 33 ms
    // Memory Usage: 48.2 MB
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                char character = board[row][column];
                if (character != '.') {
                    if (!set.add(character + "_R_" + row) ||
                            !set.add(character + "_C_" + column) ||
                            !set.add(character + "_B_" + row / 3 + "_" + column / 3)) return false;
                }
            }
        }
        return true;
    }
}
