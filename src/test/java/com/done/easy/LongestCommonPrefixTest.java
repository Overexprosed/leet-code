package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix target = new LongestCommonPrefix();

    @Test
    public void test1() {
        String[] strings = {"flower", "flow", "flight"};
        Assert.assertEquals("fl", target.longestCommonPrefix(strings));
    }

    @Test
    public void test2() {
        String[] strings = {"dog", "racecar", "car"};
        Assert.assertEquals("", target.longestCommonPrefix(strings));
    }

    @Test
    public void test3() {
        String[] strings = {};
        Assert.assertEquals("", target.longestCommonPrefix(strings));
    }

    @Test
    public void test4() {
        String[] strings = {"a"};
        Assert.assertEquals("a", target.longestCommonPrefix(strings));
    }

    @Test
    public void test5() {
        String[] strings = {"flower", "flower"};
        Assert.assertEquals("flower", target.longestCommonPrefix(strings));
    }

    @Test
    public void test6() {
        String[] strings = {"fffff", "fffff"};
        Assert.assertEquals("fffff", target.longestCommonPrefix(strings));
    }

    @Test
    public void test7() {
        String[] strings = {"", ""};
        Assert.assertEquals("", target.longestCommonPrefix(strings));
    }

    @Test
    public void test8() {
        String[] strings = {"", "", "s"};
        Assert.assertEquals("", target.longestCommonPrefix(strings));
    }

    @Test
    public void test9() {
        String[] strings = {"aaa", "aa", "aaa"};
        Assert.assertEquals("aa", target.longestCommonPrefix(strings));
    }
}
