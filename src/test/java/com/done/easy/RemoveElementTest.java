package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    private final RemoveElement target = new RemoveElement();

    @Test
    public void test1() {
        int[] array = {1, 1, 2};
        int result = target.removeElement(array, 1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void test2() {
        int[] array = {1, 1, 1, 1, 1};
        int result = target.removeElement(array, 1);
        Assert.assertEquals(0, result);
    }

    @Test
    public void test3() {
        int[] array = {1};
        int result = target.removeElement(array, 1);
        Assert.assertEquals(0, result);
    }
}
