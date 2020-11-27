package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    private final LongestCommonPrefix target = new LongestCommonPrefix();

    @Test
    public void longestCommonPrefix1() {
        String[] strings = {"flower", "flow", "flight"};
        Assert.assertEquals("fl", target.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix2() {
        String[] strings = {"dog", "racecar", "car"};
        Assert.assertEquals("", target.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix3() {
        String[] strings = {};
        Assert.assertEquals("", target.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix4() {
        String[] strings = {"a"};
        Assert.assertEquals("a", target.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix5() {
        String[] strings = {"flower", "flower"};
        Assert.assertEquals("flower", target.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix6() {
        String[] strings = {"fffff", "fffff"};
        Assert.assertEquals("fffff", target.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix7() {
        String[] strings = {"", ""};
        Assert.assertEquals("", target.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix8() {
        String[] strings = {"", "", "s"};
        Assert.assertEquals("", target.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix9() {
        String[] strings = {"aaa", "aa", "aaa"};
        Assert.assertEquals("aa", target.longestCommonPrefix(strings));
    }
}
