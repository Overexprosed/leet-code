package com.done.easy;

/**
 * Search Insert Position
 *
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0 || (nums.length == 1 && nums[0] > target)) return 0;
        if (nums.length == 1 && nums[0] < target) return 1;

        int low = 0;
        int high = nums.length - 1;
        int index = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            index = mid;

            if (target > nums[mid]) {
                low = mid + 1;
            }
            else if (target < nums[mid]) {
                high = mid - 1;
            }
            else if (target == nums[mid]) {
                return index;
            }
        }
        return (nums[index] < target) ? ++index : index;
    }
}
