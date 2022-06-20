package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class PascalsTriangleTest {

    PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void generate() {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1),
                Arrays.asList(1, 3, 3, 1), Arrays.asList(1, 4, 6, 4, 1));
        List<List<Integer>> actual = pascalsTriangle.generate(5);
        Assertions.assertArrayEquals(expected.toArray(), actual.toArray());
    }
}
