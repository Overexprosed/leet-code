package com.done.easy;

/**
 * Find the element which appears more than half times.
 *
 * ---
 * Boyer–Moore majority vote algorithm.
 * It's like boxing. Wins who beats more than others.
 * Of course if strength of hits are equals :)
 */
public class MajorityElement {

    public int findMajorityElement(int[] nums) {
        int result = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                result = num;
                count++;
            } else if (num == result) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;

        // verifying if found result is correct
        for (int num : nums) {
            if (num == result) {
                count++;
            }
        }
        if (count > nums.length/2) {
            return result;
        } else {
            return -1;
        }
    }
}
