package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberTest {

    private final FibonacciNumber target = new FibonacciNumber();

    @Test
    public void test1() {
        Assert.assertEquals(0, target.fib(0));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, target.fib(1));
    }

    @Test
    public void test3() {
        Assert.assertEquals(1, target.fib(2));
    }

    @Test
    public void test4() {
        Assert.assertEquals(2, target.fib(3));
    }

    @Test
    public void test5() {
        Assert.assertEquals(3, target.fib(4));
    }

    @Test
    public void test6() {
        Assert.assertEquals(5, target.fib(5));
    }

    @Test
    public void test7() {
        Assert.assertEquals(8, target.fib(6));
    }

    @Test
    public void test8() {
        Assert.assertEquals(13, target.fib(7));
    }

    @Test
    public void test9() {
        Assert.assertEquals(21, target.fib(8));
    }

    @Test
    public void test10() {
        Assert.assertEquals(34, target.fib(9));
    }

    @Test
    public void test11() {
        Assert.assertEquals(832040, target.fib(30));
    }
}
