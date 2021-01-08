package com.done.easy;

/**
 * Sqrt(x)
 *
 * Given a non-negative integer x, compute and return the square root of x.
 *
 * Since the return type is an integer, the decimal digits are truncated,
 * and only the integer part of the result is returned.
 *
 * ---
 * Newton's method
 */
public class Sqrt {

    public int sqrt(int x) {
        long result = x;

        while (result * result > x) {
            result = (result + x / result) / 2;
        }
        return (int) result;
    }
}
