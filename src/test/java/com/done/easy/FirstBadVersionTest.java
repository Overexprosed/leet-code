package com.done.easy;

import com.done.easy.data.VersionControl;
import org.junit.Assert;
import org.junit.Test;

public class FirstBadVersionTest {

    private final FirstBadVersion target = new FirstBadVersion();

    @Test
    public void test1() {
        Assert.assertEquals(4, target.findFirstBadVersion(5, new VersionControl(4)));
    }

    @Test
    public void test2() {
        Assert.assertEquals(Integer.MAX_VALUE, target.findFirstBadVersion(Integer.MAX_VALUE, new VersionControl(Integer.MAX_VALUE)));
    }

    @Test
    public void test3() {
        Assert.assertEquals(0, target.findFirstBadVersion(0, new VersionControl(0)));
    }

    @Test
    public void test4() {
        Assert.assertEquals(1, target.findFirstBadVersion(10, new VersionControl(1)));
    }
}
