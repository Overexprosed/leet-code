package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

    private final LengthOfLastWord target = new LengthOfLastWord();

    @Test
    public void test1() {
        Assert.assertEquals(5, target.findLengthOfLastWord("Hello World"));
    }

    @Test
    public void test2() {
        Assert.assertEquals(5, target.findLengthOfLastWord("World    "));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, target.findLengthOfLastWord(" "));
    }
}
