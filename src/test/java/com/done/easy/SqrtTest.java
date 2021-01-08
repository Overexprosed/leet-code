package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class SqrtTest {

    private final Sqrt target = new Sqrt();

    @Test
    public void test1() {
        Assert.assertEquals(2, target.sqrt(4));
    }

    @Test
    public void test2() {
        Assert.assertEquals(2, target.sqrt(8));
    }

    @Test
    public void test3() {
        Assert.assertEquals(10, target.sqrt(100));
    }

    @Test
    public void test4() {
        Assert.assertEquals(46340, target.sqrt(Integer.MAX_VALUE));
    }

    @Test
    public void test5() {
        Assert.assertEquals(0, target.sqrt(0));
    }

    @Test
    public void test6() {
        Assert.assertEquals(1, target.sqrt(1));
    }

    @Test
    public void test7() {
        Assert.assertEquals(1, target.sqrt(2));
    }
}
