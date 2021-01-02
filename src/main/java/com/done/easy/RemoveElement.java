package com.done.easy;

/**
 * Remove Element
 *
 * Given an array nums and a value val,
 * remove all instances of that value in-place
 * and return the new length.
 *
 * Do not allocate extra space for another array,
 * you must do this by modifying the input array in-place
 * with O(1) extra memory.
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int newLength = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val) {
                continue;
            }
            nums[newLength++] = nums[i];
        }
        return newLength;
    }
}
