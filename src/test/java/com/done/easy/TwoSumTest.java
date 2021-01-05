package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    private final TwoSum target = new TwoSum();

    @Test
    public void test1() {
        int[] testArray = {2, 7, 11, 15};
        int[] expectedArray = {0, 1};
        Assert.assertArrayEquals(expectedArray, target.twoSum(testArray, 9));
    }

    @Test
    public void test2() {
        int[] testArray = {3, 2, 4};
        int[] expectedArray = {1, 2};
        Assert.assertArrayEquals(expectedArray, target.twoSum(testArray, 6));
    }

    @Test
    public void test3() {
        int[] testArray = {3, 3};
        int[] expectedArray = {0, 1};
        Assert.assertArrayEquals(expectedArray, target.twoSum(testArray, 6));
    }

    @Test
    public void test4() {
        int[] testArray = {};
        int[] expectedArray = {};
        Assert.assertArrayEquals(expectedArray, target.twoSum(testArray, 0));
    }
}
