package com.done.easy;

/**
 * Given a string s consists of some words separated by spaces,
 * return the length of the last word in the string.
 * If the last word does not exist, return 0.
 *
 * A word is a maximal substring consisting of non-space characters only.
 */
public class LengthOfLastWord {

    public int findLengthOfLastWord(String str) {
        int count = 0;
        int noSpaceSize = 0;
        int len = str.length() - 1;

        while (len != -1 && str.charAt(len) == ' ') { // remove all the back white spaces
            len--;
        }
        if (len == -1) return 0;

        noSpaceSize = str.length() - 1 - len; // length without the back white spaces
        while (count != (str.length() - noSpaceSize) && str.charAt(len) != ' ') {
            count++;
            len--;
        }
        return count;
    }
}
