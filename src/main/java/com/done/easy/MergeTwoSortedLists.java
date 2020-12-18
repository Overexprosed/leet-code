package com.done.easy;

import com.done.easy.data.ListNode;

/**
 * Merge two sorted linked lists and return it as a new sorted list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null) return listNode2;
        if (listNode2 == null) return listNode1;

        if (listNode1.val < listNode2.val) {
            listNode1.next = mergeTwoLists(listNode1.next, listNode2);
            return listNode1;
        } else {
            listNode2.next = mergeTwoLists(listNode1, listNode2.next);
            return listNode2;
        }
    }
}
