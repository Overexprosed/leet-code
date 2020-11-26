package com.done.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 * Input: x = 123
 * Output: 321
 *
 * Example 2:
 * Input: x = -123
 * Output: -321
 *
 * Constraints : -2^31 <= x <= 2^31 - 1
 *
 * Integer.MAX_VALUE = 2147483647
 * Integer.MIN_VALUE = -2147483648
 */
public class ReverseInteger {

    public int reverse(int x) {
        long reversed = 0;
        boolean negative = false;

        if (x == 0) {
            return 0;
        }

        if (x < 0) {
            negative = true;
            x *= -1;
        }

        while (x != 0) {
            int digit = x % 10; // откусываем последний знак
            reversed = reversed * 10 + digit; // прибавляем след-им разрядом, т.е. создаем этот новый разряд, добавляя 0 к тому что уже есть
            x /= 10; // int кастится в меньшую, т.е. отбрасываем последний знак
        }

        // overflow
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (negative ? reversed * -1 : reversed);
    }
}
