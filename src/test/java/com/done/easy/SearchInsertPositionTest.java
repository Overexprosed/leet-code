package com.done.easy;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest {

    private final SearchInsertPosition target = new SearchInsertPosition();

    @Test
    public void searchInsertTest1() {
        int[] array = {1, 3, 5, 6};
        int target = 5;
        int result = this.target.searchInsert(array, target);
        Assert.assertEquals(2, result);
    }

    @Test
    public void searchInsertTest2() {
        int[] array = {1, 3, 5, 6};
        int target = 2;
        int result = this.target.searchInsert(array, target);
        Assert.assertEquals(1, result);
    }

    @Test
    public void searchInsertTest3() {
        int[] array = {1, 3, 5, 6};
        int target = 7;
        int result = this.target.searchInsert(array, target);
        Assert.assertEquals(4, result);
    }

    @Test
    public void searchInsertTest4() {
        int[] array = {};
        int target = 1;
        int result = this.target.searchInsert(array, target);
        Assert.assertEquals(0, result);
    }

    @Test
    public void searchInsertTest5() {
        int[] array = {2};
        int target = 1;
        int result = this.target.searchInsert(array, target);
        Assert.assertEquals(0, result);
    }

    @Test
    public void searchInsertTest6() {
        int[] array = {2};
        int target = 3;
        int result = this.target.searchInsert(array, target);
        Assert.assertEquals(1, result);
    }
}
