package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesTest {

    private final JewelsAndStones target = new JewelsAndStones();

    @Test
    public void test1() {
        Assert.assertEquals(3, target.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(0, target.numJewelsInStones("z", "ZZ"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, target.numJewelsInStones("", "ZZ"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, target.numJewelsInStones("ZZ", ""));
    }
}
