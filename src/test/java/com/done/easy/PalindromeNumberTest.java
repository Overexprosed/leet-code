package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    private final PalindromeNumber target = new PalindromeNumber();

    @Test
    public void test1() {
        Assert.assertTrue(target.isPalindrome(121));
    }

    @Test
    public void test2() {
        Assert.assertFalse(target.isPalindrome(-121));
    }

    @Test
    public void test3() {
        Assert.assertTrue(target.isPalindrome(0));
    }

    @Test
    public void test4() {
        Assert.assertFalse(target.isPalindrome(Integer.MAX_VALUE));
    }

    @Test
    public void test5() {
        Assert.assertFalse(target.isPalindrome(Integer.MIN_VALUE));
    }
}
