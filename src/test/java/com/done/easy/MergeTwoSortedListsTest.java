package com.done.easy;

import com.done.easy.data.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class MergeTwoSortedListsTest {

    private final MergeTwoSortedLists target = new MergeTwoSortedLists();

    @Test
    public void test1() {
        ListNode l1 = new ListNode(); // []
        ListNode l2 = new ListNode(); // []
        ListNode result = target.mergeTwoLists(l1, l2);

        Assert.assertNotNull(result);
    }

    @Test
    public void test2() {
        ListNode l1 = new ListNode(); // []
        ListNode l2 = new ListNode(0); // [0]
        ListNode result = target.mergeTwoLists(l1, l2);

        Assert.assertEquals(0, extractNumber(result));
    }

    @Test
    public void test3() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4))); // [1,2,4]
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4))); // [1,3,4]
        ListNode result = target.mergeTwoLists(l1, l2);
        System.out.println("Result = " + result.hashCode());

        Assert.assertEquals(112344, extractNumber(result));
    }

    @Test
    public void test4() {
        ListNode l1 = new ListNode(); // []
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))))); // [1,9,9,9,9,9,9,9,9,9]
        ListNode result = target.mergeTwoLists(l1, l2);

        Assert.assertEquals(1999999999, extractNumber(result));
    }

    @Test
    public void test5() {
        ListNode l1 = new ListNode(1, new ListNode(4, new ListNode(5))); // [1,4,5]
        ListNode l2 = new ListNode(2, new ListNode(3, new ListNode(6))); // [2,3,6]
        ListNode result = target.mergeTwoLists(l1, l2);

        Assert.assertEquals(123456, extractNumber(result));
    }

    private long extractNumber(ListNode listNode) {
        if (listNode == null) return 0;

        StringBuilder result = new StringBuilder();
        while (listNode != null) {
            result.append(listNode.val);
            listNode = listNode.next;
        }
        return Long.parseLong(result.toString());
    }
}
