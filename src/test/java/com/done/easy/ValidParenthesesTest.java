package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    private final ValidParentheses target = new ValidParentheses();

    @Test
    public void test1() {
        Assert.assertTrue(target.isValid("()"));
    }

    @Test
    public void test2() {
        Assert.assertFalse(target.isValid("(}"));
    }

    @Test
    public void test3() {
        Assert.assertTrue(target.isValid("[]"));
    }

    @Test
    public void test4() {
        Assert.assertTrue(target.isValid("{}"));
    }

    @Test
    public void test5() {
        Assert.assertTrue(target.isValid("(){}[]"));
    }

    @Test
    public void test6() {
        Assert.assertTrue(target.isValid("({([])})"));
    }

    @Test
    public void test7() {
        Assert.assertFalse(target.isValid("({([])))"));
    }

    @Test
    public void test8() {
        Assert.assertFalse(target.isValid("("));
    }

    @Test
    public void test9() {
        Assert.assertFalse(target.isValid("]"));
    }

    @Test
    public void test10() {
        Assert.assertFalse(target.isValid("(])"));
    }
}
