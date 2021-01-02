package com.done.easy;

/**
 * Remove Duplicates from Sorted Array
 *
 * Given a sorted array nums,
 * remove the duplicates in-place such that each element appears only once and returns the new length.
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int newLength = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[newLength++] = nums[i];
        }
        return newLength;
    }
}
