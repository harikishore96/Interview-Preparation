package com.silentanonym.interviewprep.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciNumberTest {

  FibonacciNumber fibonacciNumber = new FibonacciNumber();

  @Test
  void fib1() {
    Assertions.assertEquals(0, fibonacciNumber.fib1(0));
    Assertions.assertEquals(1, fibonacciNumber.fib1(1));
    Assertions.assertEquals(1, fibonacciNumber.fib1(2));
    Assertions.assertEquals(2, fibonacciNumber.fib1(3));
    Assertions.assertEquals(3, fibonacciNumber.fib1(4));
    Assertions.assertEquals(55, fibonacciNumber.fib1(10));
  }

  @Test
  void fib2() {
    Assertions.assertEquals(0, fibonacciNumber.fib2(0));
    Assertions.assertEquals(1, fibonacciNumber.fib2(1));
    Assertions.assertEquals(1, fibonacciNumber.fib2(2));
    Assertions.assertEquals(2, fibonacciNumber.fib2(3));
    Assertions.assertEquals(3, fibonacciNumber.fib2(4));
    Assertions.assertEquals(55, fibonacciNumber.fib2(10));
  }

  @Test
  void fib() {
    Assertions.assertEquals(1, fibonacciNumber.fib(2));
    Assertions.assertEquals(2, fibonacciNumber.fib(3));
    Assertions.assertEquals(3, fibonacciNumber.fib(4));
  }
}
