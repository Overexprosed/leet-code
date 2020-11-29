package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    ValidParentheses target = new ValidParentheses();

    @Test
    public void isValid1() {
        Assert.assertTrue(target.isValid("()"));
    }

    @Test
    public void isValid2() {
        Assert.assertFalse(target.isValid("(}"));
    }

    @Test
    public void isValid3() {
        Assert.assertTrue(target.isValid("[]"));
    }

    @Test
    public void isValid4() {
        Assert.assertTrue(target.isValid("{}"));
    }

    @Test
    public void isValid5() {
        Assert.assertTrue(target.isValid("(){}[]"));
    }

    @Test
    public void isValid6() {
        Assert.assertTrue(target.isValid("({([])})"));
    }

    @Test
    public void isValid7() {
        Assert.assertFalse(target.isValid("({([])))"));
    }

    @Test
    public void isValid8() {
        Assert.assertFalse(target.isValid("("));
    }

    @Test
    public void isValid9() {
        Assert.assertFalse(target.isValid("]"));
    }

    @Test
    public void isValid10() {
        Assert.assertFalse(target.isValid("(])"));
    }
}
