package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterTest {

    private final FirstUniqueCharacter target = new FirstUniqueCharacter();

    @Test
    public void test1() {
        Assert.assertEquals(0, target.firstUniqueChar("leetcode"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(2, target.firstUniqueChar("loveleetcode"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(-1, target.firstUniqueChar(""));
    }

    @Test
    public void test4() {
        Assert.assertEquals(2, target.firstUniqueChar("abcdba"));
    }
}
