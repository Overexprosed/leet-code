package com.done.easy;

import com.done.easy.data.ListNode;

/**
 * Remove Duplicates from Sorted List
 *
 * Given the head of a sorted linked list.
 * Delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 * ---
 * Create 'list' as a temporal variable to not compromise an initial variable
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode list = head;
        while (list.next != null) {
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }
        return head;
    }
}
