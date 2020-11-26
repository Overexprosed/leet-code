package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    private final PalindromeNumber target = new PalindromeNumber();

    @Test
    public void isPalindrome1() {
        Assert.assertTrue(target.isPalindrome(121));
    }

    @Test
    public void isPalindrome2() {
        Assert.assertFalse(target.isPalindrome(-121));
    }

    @Test
    public void isPalindrome3() {
        Assert.assertTrue(target.isPalindrome(0));
    }

    @Test
    public void isPalindrome4() {
        Assert.assertFalse(target.isPalindrome(Integer.MAX_VALUE));
    }

    @Test
    public void isPalindrome5() {
        Assert.assertFalse(target.isPalindrome(Integer.MIN_VALUE));
    }
}
