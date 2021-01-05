package com.done.easy;

import java.util.HashMap;

/**
 * Problem explanation
 *
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * Algorithm explanation
 *
 * Traverse array only once, saving complement of the target value and current array element,
 * and check this complement for each further array elements.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] resultArray = new int[2];

        for (int i=0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (hashMap.containsKey(nums[i])) {
                resultArray[0] = hashMap.get(nums[i]);
                resultArray[1] = i;

                return resultArray;
            } else {
                hashMap.put(complement, i);
            }
        }
        return new int[0];
    }
}
