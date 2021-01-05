package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

    private final RemoveDuplicates target = new RemoveDuplicates();

    @Test
    public void test1() {
        int[] array = {1, 1, 2};
        int result = target.removeDuplicates(array);
        Assert.assertEquals(2, result);
    }

    @Test
    public void test2() {
        int [] array = {1, 2, 3};
        int result = target.removeDuplicates(array);
        Assert.assertEquals(3, result);
    }

    @Test
    public void test3() {
        int [] array = {1, 1, 1};
        int result = target.removeDuplicates(array);
        Assert.assertEquals(1, result);
    }
}
