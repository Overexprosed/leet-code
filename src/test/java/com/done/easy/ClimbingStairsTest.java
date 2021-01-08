package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class ClimbingStairsTest {

    private final ClimbingStairs target = new ClimbingStairs();

    @Test
    public void test1() {
        Assert.assertEquals(0, target.climbStairs(0));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, target.climbStairs(1));
    }

    @Test
    public void test3() {
        Assert.assertEquals(2, target.climbStairs(2));
    }

    @Test
    public void test4() {
        Assert.assertEquals(3, target.climbStairs(3));
    }

    @Test
    public void test5() {
        Assert.assertEquals(5, target.climbStairs(4));
    }

    @Test
    public void test6() {
        Assert.assertEquals(8, target.climbStairs(5));
    }

    @Test
    public void test7() {
        Assert.assertEquals(13, target.climbStairs(6));
    }

    @Test
    public void test8() {
        Assert.assertEquals(21, target.climbStairs(7));
    }

    @Test
    public void test9() {
        Assert.assertEquals(34, target.climbStairs(8));
    }
}
