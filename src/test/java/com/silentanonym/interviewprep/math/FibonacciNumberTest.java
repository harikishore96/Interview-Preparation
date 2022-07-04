package com.silentanonym.interviewprep.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciNumberTest {

    FibonacciNumber fibonacciNumber = new FibonacciNumber();

    @Test
    void fib() {
        Assertions.assertEquals(1, fibonacciNumber.fib(2));
        Assertions.assertEquals(2, fibonacciNumber.fib(3));
        Assertions.assertEquals(3, fibonacciNumber.fib(4));
    }
}
