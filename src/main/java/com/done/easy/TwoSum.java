package com.done.easy;

import java.util.HashMap;

/**
 * Первый аргумент массив, второй аргумент сумма двух любых его значений.
 * Результат массив из 2х эллементов, содержащий позиции искомых элементов.
 *
 * Вместо того, чтобы каждый раз обходить массив,
 * пройди его один раз, записывая нужное значение как value в HashMap, его ключ - условие,
 * при котором это значение нужно получить.
 * Это занимает место, но доступ по ключу O(1).
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] array2 = {2, 5, 5, 10};

        int[] result = twoSum(array2, 16);
        if (result.length == 0) {
            System.out.println("Not found");
        } else {
            System.out.println("Result = [" + result[0] + ", " + result[1] + "].");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
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
