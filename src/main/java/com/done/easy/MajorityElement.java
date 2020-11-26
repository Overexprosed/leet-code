package com.done.easy;

/**
 * Find the element which appears more than half times.
 *
 * Boyer–Moore majority vote algorithm.
 *
 * It's like boxing. Wins who beats more than others. Of course if strength of hits are equals :)
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] array1 = {3, 2, 3};
        assert majorityElement(array1) == 3;

        int[] array2 = {2, 2, 1, 1, 1, 2, 2};
        assert majorityElement(array2) == 2;

        int[] array3 = {1, 2};
        assert majorityElement(array3) == -1;

        int[] array4 = {};
        assert majorityElement(array4) == -1;

        int[] array5 = {2, 3, 2, 3};
        assert majorityElement(array5) == -1;

        int[] array6 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assert majorityElement(array6) == -1;

        int[] array7 = {1, 1, 1, 1, 3, 6, 7, 8, 9, 2};
        assert majorityElement(array7) == -1;

        int[] array8 = {1, 1, 1, 1, 1, 6, 7, 8, 9, 2};
        assert majorityElement(array8) == -1;

        int[] array9 = {3, 3, 1};
        assert majorityElement(array9) == 3;

        System.out.println("Everything is great! :)");
    }

    public static int majorityElement(int[] nums) {
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
