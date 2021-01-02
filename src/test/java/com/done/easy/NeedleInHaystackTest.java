package com.done.easy;

import com.done.easy.data.NeedleInHaystack;
import org.junit.Assert;
import org.junit.Test;

public class NeedleInHaystackTest {

    private final NeedleInHaystack target = new NeedleInHaystack();

    @Test
    public void strTest1() {
        Assert.assertEquals(2, target.strStr("hello", "ll"));
    }

    @Test
    public void strTest2() {
        Assert.assertEquals(0, target.strStr("hello", ""));
    }

    @Test
    public void strTest3() {
        Assert.assertEquals(-1, target.strStr("haystackNeedle", "needle"));
    }

    @Test
    public void strTest4() {
        Assert.assertEquals(8, target.strStr("haystackNeedle", "Needle"));
    }

    @Test
    public void strTest5() {
        Assert.assertEquals(4, target.strStr("mississipi", "issip"));
    }

    @Test
    public void strTest6() {
        Assert.assertEquals(-1, target.strStr("aaa", "aaaa"));
    }

    @Test
    public void strTest7() {
        Assert.assertEquals(-1, target.strStr("mississippi", "issipi"));
    }

    @Test
    public void strTest8() {
        Assert.assertEquals(0, target.strStr("a", "a"));
    }
}
