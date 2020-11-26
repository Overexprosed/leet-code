package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class FirstUniqueCharacterTest {

    private final FirstUniqueCharacter target = new FirstUniqueCharacter();

    @Test
    public void firstUniqueChar1() {
        Assert.assertEquals(0, target.firstUniqueChar("leetcode"));
    }

    @Test
    public void firstUniqueChar2() {
        Assert.assertEquals(2, target.firstUniqueChar("loveleetcode"));
    }

    @Test
    public void firstUniqueChar3() {
        Assert.assertEquals(-1, target.firstUniqueChar(""));
    }

    @Test
    public void firstUniqueChar4() {
        Assert.assertEquals(2, target.firstUniqueChar("abcdba"));
    }
}
