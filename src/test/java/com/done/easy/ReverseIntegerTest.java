package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {

    private final ReverseInteger target = new ReverseInteger();

    @Test
    public void reverse1() {
        Assert.assertEquals(321, target.reverse(123));
    }

    @Test
    public void reverse2() {
        Assert.assertEquals(-321, target.reverse(-123));
    }

    @Test
    public void reverse3() {
        Assert.assertEquals(0, target.reverse(0));
    }

    @Test
    public void reverse4() {
        Assert.assertEquals(21, target.reverse(120));
    }

    @Test
    public void reverse5() {
        Assert.assertEquals(0, target.reverse(Integer.MAX_VALUE));
    }

    @Test
    public void reverse6() {
        Assert.assertEquals(0, target.reverse(Integer.MIN_VALUE));
    }

    @Test
    public void reverse7() {
        Assert.assertEquals(0, target.reverse(1534236469));
    }

    @Test
    public void reverse8() {
        Assert.assertEquals(-2143847412, target.reverse(-2147483412));
    }
}
