package com.done.easy;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 * Input: x = 121
 * Output: true
 *
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 * Constraints : -2^31 <= x <= 2^31 - 1
 *
 * Integer.MAX_VALUE = 2147483647
 * Integer.MIN_VALUE = -2147483648
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        long reversed = 0;
        int initialValue = x;

        if (x == 0 ) {
            return true;
        } else if (x < 0) {
            return false;
        }

        while(x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return false;
        }
        return reversed == initialValue;
    }
}
