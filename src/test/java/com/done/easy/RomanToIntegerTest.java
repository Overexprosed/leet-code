package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {

    private final RomanToInteger target = new RomanToInteger();

    @Test
    public void romanToInt1() {
        Assert.assertEquals(1, target.romanToInt("I"));
    }

    @Test
    public void romanToInt2() {
        Assert.assertEquals(5, target.romanToInt("V"));
    }

    @Test
    public void romanToInt3() {
        Assert.assertEquals(10, target.romanToInt("X"));
    }

    @Test
    public void romanToInt4() {
        Assert.assertEquals(50, target.romanToInt("L"));
    }

    @Test
    public void romanToInt5() {
        Assert.assertEquals(100, target.romanToInt("C"));
    }

    @Test
    public void romanToInt6() {
        Assert.assertEquals(500, target.romanToInt("D"));
    }

    @Test
    public void romanToInt7() {
        Assert.assertEquals(1000, target.romanToInt("M"));
    }

    @Test
    public void romanToInt8() {
        Assert.assertEquals(9, target.romanToInt("IX"));
    }

    @Test
    public void romanToInt9() {
        Assert.assertEquals(4, target.romanToInt("IV"));
    }

    @Test
    public void romanToInt10() {
        Assert.assertEquals(40, target.romanToInt("XL"));
    }

    @Test
    public void romanToInt11() {
        Assert.assertEquals(90, target.romanToInt("XC"));
    }

    @Test
    public void romanToInt12() {
        Assert.assertEquals(400, target.romanToInt("CD"));
    }

    @Test
    public void romanToInt13() {
        Assert.assertEquals(900, target.romanToInt("CM"));
    }

    @Test
    public void romanToInt14() {
        Assert.assertEquals(20, target.romanToInt("XX"));
    }

    @Test
    public void romanToInt15() {
        Assert.assertEquals(3, target.romanToInt("III"));
    }

    @Test
    public void romanToInt16() {
        Assert.assertEquals(58, target.romanToInt("LVIII"));
    }

    @Test
    public void romanToInt17() {
        Assert.assertEquals(1994, target.romanToInt("MCMXCIV"));
    }
}
