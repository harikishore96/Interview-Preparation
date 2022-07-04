package com.silentanonym.interviewprep.linkedlist;

public class FibonacciNumber {

    public int fib(int n) {
        return fib(n, new int[31]);
    }

    private int fib(int n, int[] map) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (map[n] == 0) {
            map[n] = fib(n - 1, map) + fib(n - 2, map);
        }
        return map[n];
    }
}
