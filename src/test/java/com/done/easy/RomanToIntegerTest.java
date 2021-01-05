package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    private final RomanToInteger target = new RomanToInteger();

    @Test
    public void test1() {
        Assert.assertEquals(1, target.romanToInt("I"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(5, target.romanToInt("V"));
    }

    @Test
    public void test3() {
        Assert.assertEquals(10, target.romanToInt("X"));
    }

    @Test
    public void test4() {
        Assert.assertEquals(50, target.romanToInt("L"));
    }

    @Test
    public void test5() {
        Assert.assertEquals(100, target.romanToInt("C"));
    }

    @Test
    public void test6() {
        Assert.assertEquals(500, target.romanToInt("D"));
    }

    @Test
    public void test7() {
        Assert.assertEquals(1000, target.romanToInt("M"));
    }

    @Test
    public void test8() {
        Assert.assertEquals(9, target.romanToInt("IX"));
    }

    @Test
    public void test9() {
        Assert.assertEquals(4, target.romanToInt("IV"));
    }

    @Test
    public void test10() {
        Assert.assertEquals(40, target.romanToInt("XL"));
    }

    @Test
    public void test11() {
        Assert.assertEquals(90, target.romanToInt("XC"));
    }

    @Test
    public void test12() {
        Assert.assertEquals(400, target.romanToInt("CD"));
    }

    @Test
    public void test13() {
        Assert.assertEquals(900, target.romanToInt("CM"));
    }

    @Test
    public void test14() {
        Assert.assertEquals(20, target.romanToInt("XX"));
    }

    @Test
    public void test15() {
        Assert.assertEquals(3, target.romanToInt("III"));
    }

    @Test
    public void test16() {
        Assert.assertEquals(58, target.romanToInt("LVIII"));
    }

    @Test
    public void test17() {
        Assert.assertEquals(1994, target.romanToInt("MCMXCIV"));
    }
}
