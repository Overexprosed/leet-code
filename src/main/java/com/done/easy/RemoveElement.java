package com.done.easy;

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
