package com.done.easy;

import com.done.easy.data.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesFromSortedListTest {

    private final RemoveDuplicatesFromSortedList target = new RemoveDuplicatesFromSortedList();

    @Test
    public void test1() {
        ListNode testNode = new ListNode(1, new ListNode(1, new ListNode(2))); // [1, 1, 2]
        ListNode expectedNode = new ListNode(1, new ListNode(2));
        Assert.assertEquals(expectedNode, target.deleteDuplicates(testNode));
    }

    @Test
    public void test2() {
        ListNode testNode = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3))))); // [1, 1, 2, 3, 3]
        ListNode expectedNode = new ListNode(1, new ListNode(2, new ListNode(3)));
        Assert.assertEquals(expectedNode, target.deleteDuplicates(testNode));
    }

    @Test
    public void test3() {
        ListNode testNode = new ListNode(1);
        ListNode expectedNode = new ListNode(1);
        Assert.assertEquals(expectedNode, target.deleteDuplicates(testNode));
    }

    @Test
    public void test4() {
        ListNode testNode = new ListNode(3, new ListNode(3));
        ListNode expectedNode = new ListNode(3);
        Assert.assertEquals(expectedNode, target.deleteDuplicates(testNode));
    }
}
