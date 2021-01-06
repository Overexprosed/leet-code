package com.done.easy;

/**
 * Jewels and Stones
 *
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have.
 * Each character in stones is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 *
 * Algorithm explanation
 *
 * Use array like a lookup service
 */
public class JewelsAndStones {

    public int numJewelsInStones(String j, String s) {
        if (j.length() > 50 || s.length() > 50) return 0;

        // initialization
        boolean[] jewels = new boolean[59];
        for (int i = 0; i < j.length(); i++) {
            jewels[123 - j.codePointAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (jewels[123 - s.codePointAt(i)]) {
                count++;
            }
        }
        return count;
    }
}
