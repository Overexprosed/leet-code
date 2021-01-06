package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElementTest {

    private final MajorityElement target = new MajorityElement();

    @Test
    public void test1() {
        int[] array1 = {3, 2, 3};
        Assert.assertEquals(3, target.findMajorityElement(array1));
    }

    @Test
    public void test2() {
        int[] array1 = {2, 2, 1, 1, 1, 2, 2};
        Assert.assertEquals(2, target.findMajorityElement(array1));
    }

    @Test
    public void test3() {
        int[] array1 = {1, 2};
        Assert.assertEquals(-1, target.findMajorityElement(array1));
    }

    @Test
    public void test4() {
        int[] array1 = {};
        Assert.assertEquals(-1, target.findMajorityElement(array1));
    }

    @Test
    public void test5() {
        int[] array1 = {2, 3, 2, 3};
        Assert.assertEquals(-1, target.findMajorityElement(array1));
    }

    @Test
    public void test6() {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertEquals(-1, target.findMajorityElement(array1));
    }

    @Test
    public void test7() {
        int[] array1 = {1, 1, 1, 1, 3, 6, 7, 8, 9, 2};
        Assert.assertEquals(-1, target.findMajorityElement(array1));
    }

    @Test
    public void test8() {
        int[] array1 = {1, 1, 1, 1, 1, 6, 7, 8, 9, 2};
        Assert.assertEquals(-1, target.findMajorityElement(array1));
    }

    @Test
    public void test9() {
        int[] array1 = {3, 3, 1};
        Assert.assertEquals(3, target.findMajorityElement(array1));
    }
}
