package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumMovesToEqualArrayElementsIITest {

    MinimumMovesToEqualArrayElementsII minimumMovesToEqualArrayElementsII = new MinimumMovesToEqualArrayElementsII();

    @Test
    void minMoves2() {
        Assertions.assertEquals(2, minimumMovesToEqualArrayElementsII.minMoves2(new int[]{1, 2, 3}));
        Assertions.assertEquals(16, minimumMovesToEqualArrayElementsII.minMoves2(new int[]{1, 10, 2, 9}));
    }
}
