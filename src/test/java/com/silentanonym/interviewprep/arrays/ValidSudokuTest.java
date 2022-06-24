package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidSudokuTest {

    ValidSudoku validSudoku = new ValidSudoku();

    @Test
    void isValidSudoku() {

        char[][] board = testData1();
        Assertions.assertTrue(validSudoku.isValidSudoku(board));

        board = testData2();
        Assertions.assertFalse(validSudoku.isValidSudoku(board));
    }

    @Test
    void isValidSudoku1() {

        char[][] board = testData1();
        Assertions.assertTrue(validSudoku.isValidSudoku1(board));

        board = testData2();
        Assertions.assertFalse(validSudoku.isValidSudoku1(board));
    }

    private char[][] testData1() {
        return new char[][]{
                new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
    }

    private char[][] testData2() {
        return new char[][]{
                new char[]{'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
    }
}
