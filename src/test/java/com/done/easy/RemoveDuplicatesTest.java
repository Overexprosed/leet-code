package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

    private final RemoveDuplicates target = new RemoveDuplicates();

    @Test
    public void removeDuplicates1() {
        int[] array = {1, 1, 2};
        int result = target.removeDuplicates(array);
        Assert.assertEquals(2, result);
    }

    @Test
    public void removeDuplicates2() {
        int [] array = {1, 2, 3};
        int result = target.removeDuplicates(array);
        Assert.assertEquals(3, result);
    }

    @Test
    public void removeDuplicates3() {
        int [] array = {1, 1, 1};
        int result = target.removeDuplicates(array);
        Assert.assertEquals(1, result);
    }
}
