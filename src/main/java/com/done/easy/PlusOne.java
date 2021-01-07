package com.done.easy;

/**
 * Plus One
 *
 * Given a non-empty array of decimal digits representing a non-negative integer.
 * Increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = ++digits[i];
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        // initial array consists only 99..
        if (digits[0] == 0) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            System.arraycopy(digits, 0, newArray, 1, digits.length - 1);
            return newArray;
        }
        return digits;
    }
}
