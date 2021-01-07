package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    private final PlusOne target = new PlusOne();

    @Test
    public void test1() {
        int[] testArray = {1, 2, 3};
        int[] expectedArray = {1, 2, 4};
        Assert.assertArrayEquals(expectedArray, target.plusOne(testArray));
    }

    @Test
    public void test2() {
        int[] testArray = {4, 3, 2, 1};
        int[] expectedArray = {4, 3, 2, 2};
        Assert.assertArrayEquals(expectedArray, target.plusOne(testArray));
    }

    @Test
    public void test3() {
        int[] testArray = {0};
        int[] expectedArray = {1};
        Assert.assertArrayEquals(expectedArray, target.plusOne(testArray));
    }

    @Test
    public void test4() {
        int[] testArray = {9};
        int[] expectedArray = {1, 0};
        Assert.assertArrayEquals(expectedArray, target.plusOne(testArray));
    }
}
