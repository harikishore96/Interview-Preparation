package com.silentanonym.interviewprep.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SecondMinimumTest {

    SecondMinimum secondMinimum = new SecondMinimum();

    @Test
    void secondMinimum() {
        Assertions.assertEquals(1, secondMinimum.secondMinimum(new int[]{3, 6, 2, 1, 8, 0}));
    }
}
