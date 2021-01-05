package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class NeedleInHaystackTest {

    private final NeedleInHaystack target = new NeedleInHaystack();

    @Test
    public void test1() {
        Assert.assertEquals(2, target.strStr("hello", "ll"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(0, target.strStr("hello", ""));
    }

    @Test
    public void test3() {
        Assert.assertEquals(-1, target.strStr("haystackNeedle", "needle"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(8, target.strStr("haystackNeedle", "Needle"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(4, target.strStr("mississipi", "issip"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(-1, target.strStr("aaa", "aaaa"));
    }

    @Test
    public void test7() {
        Assert.assertEquals(-1, target.strStr("mississippi", "issipi"));
    }

    @Test
    public void test8() {
        Assert.assertEquals(0, target.strStr("a", "a"));
    }
}
