package com.done.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 * Constraints:
 *  * 0 <= strs.length <= 200
 *  * 0 <= strs[i].length <= 200
 *  * strs[i] consists of only lower-case English letters.
 *
 *  ---
 *  Take prefix as length of first word (it's max length).
 *  Next we try to find shorter prefix, comparing each next word with current prefix.
 *  If we have found -> it's our new prefix.
 *  If prefix is zero -> break the cycle.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";

        String prefix = strs[0];
        int prefixLength = prefix.length();
        for (int i = 1; i < strs.length; i++) {
            String currentString = strs[i];
            int newPrefixLength = 0;

            while (newPrefixLength < currentString.length() &&
                   newPrefixLength < prefix.length() &&
                   currentString.charAt(newPrefixLength) == prefix.charAt(newPrefixLength)) {
                newPrefixLength++;
            }
            if (newPrefixLength < prefixLength) {
                prefixLength = newPrefixLength;
            }
            if (newPrefixLength == 0) break;
        }
        return prefix.substring(0, prefixLength);
    }
}
