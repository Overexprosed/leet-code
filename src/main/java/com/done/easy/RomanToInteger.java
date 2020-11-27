package com.done.easy;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four
 */
public class RomanToInteger {

    public int romanToInt(String s) {
        int result = 0;
        int[] integerNumbers = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    integerNumbers[i] = 1000;
                    break;
                case 'D':
                    integerNumbers[i] = 500;
                    break;
                case 'C':
                    integerNumbers[i] = 100;
                    break;
                case 'L':
                    integerNumbers[i] = 50;
                    break;
                case 'X':
                    integerNumbers[i] = 10;
                    break;
                case 'V':
                    integerNumbers[i] = 5;
                    break;
                case 'I':
                    integerNumbers[i] = 1;
                    break;
            }
        }

        for (int i = 0; i < integerNumbers.length - 1; i++) {
            if (integerNumbers[i] >= integerNumbers[i + 1]) {
                result += integerNumbers[i];
            } else {
                result -= integerNumbers[i];
            }
        }
        result += integerNumbers[integerNumbers.length - 1];
        return result;
    }
}
