package com.done.easy;

/**
 * Fibonacci Number
 *
 * 0 1 1 2 3 5 8 13 21 34 55
 *
 * Constraint : 0 <= n <= 30
 */
public class FibonacciNumber {

    public int fib(int n) {
        int[] cache = new int[31];

        if (n <= 1) return n;

        if (cache[n] != 0) {
            return cache[n];
        } else {
            return cache[n] = fib(n - 1) + fib(n - 2);
        }
    }
}
