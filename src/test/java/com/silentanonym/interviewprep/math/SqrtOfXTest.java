package com.silentanonym.interviewprep.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SqrtOfXTest {

    SqrtOfX sqrtOfX = new SqrtOfX();

    @Test
    void mySqrt() {
        Assertions.assertEquals(2, sqrtOfX.mySqrt(4));
        Assertions.assertEquals(2, sqrtOfX.mySqrt(8));
    }

    @Test
    void mySqrt1() {
        Assertions.assertEquals(2, sqrtOfX.mySqrt1(4));
        Assertions.assertEquals(2, sqrtOfX.mySqrt1(8));
        Assertions.assertEquals(1, sqrtOfX.mySqrt1(1));
    }
}
