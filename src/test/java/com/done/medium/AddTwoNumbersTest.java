package com.done.medium;

import com.done.easy.data.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {

    private final AddTwoNumbers target = new AddTwoNumbers();
    private final StringBuilder stringBuilder = new StringBuilder();

    @Test
    public void addTwoNumbers1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))); // [2,4,3]
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // [5,6,4]
        ListNode result = target.addTwoNumbers(l1, l2);

        Assert.assertEquals(708, getSum(result));
    }

    @Test
    public void addTwoNumbers2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode result = target.addTwoNumbers(l1, l2);

        Assert.assertEquals(0, getSum(result));
    }

    @Test
    public void addTwoNumbers3() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // [5,6,4]
        ListNode result = target.addTwoNumbers(l1, l2);

        Assert.assertEquals(564, getSum(result));
    }

    @Test
    public void addTwoNumbers4() {
        ListNode l1 = new ListNode(1, new ListNode(0, new ListNode(0))); // [1,0,0]
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // [5,6,4]
        ListNode result = target.addTwoNumbers(l1, l2);

        Assert.assertEquals(664, getSum(result));
    }

    @Test
    public void addTwoNumbers5() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))); // [9,9,9,9,9,9,9]
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))); // [9,9,9,9]
        ListNode result = target.addTwoNumbers(l1, l2);

        Assert.assertEquals(89990001, getSum(result));
    }

    @Test
    public void addTwoNumbers6() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))))))); // [1,9,9,9,9,9,9,9,9,9]
        ListNode result = target.addTwoNumbers(l1, l2);

        Assert.assertEquals(1, getSum(result));
    }

    private long getSum(ListNode listNode) {
        stringBuilder.append(listNode.val);
        while (listNode.next != null) {
            listNode = listNode.next;
            stringBuilder.append(listNode.val);
        }

        long result = Long.parseLong(stringBuilder.toString());
        stringBuilder.setLength(0); // clear
        return result;
    }
}
