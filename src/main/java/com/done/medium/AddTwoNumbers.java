package com.done.medium;

import com.done.easy.data.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0; // хранит 1, если сумма > 9 (единичка в уме)
        int sum = 0;
        ListNode resultNode = null;
        ListNode previousNode = null;
        ListNode temporalNode;

        while (l1 != null || l2 != null) {
            sum = carry + ((l1 != null) ? l1.val : 0) + ((l2 != null) ? l2.val : 0); // если одна из нод == null, складываем с нулем
            carry = (sum > 9) ? 1 : 0; // держим ли единичку в уме ?
            sum = sum % 10; // убираем 10, если нужно! именно по этому тут не знак минус, иначе он будет вычитать всегда, даже когда и не нужно, т.е. когда sum < 10

            temporalNode = new ListNode(sum); // создаем ноду

            if (resultNode == null) {
                resultNode = temporalNode; // если это первая нода, кладем ее первой
            } else {
                previousNode.next = temporalNode; // если не первая, кладем ее в продолжение предыдущей
            }
            previousNode = temporalNode; // отработали, делаем ее "предыдущей"
            // в этой строке связь result и previous
            // т.е. в первой итерации temporal - это result, а в этой temporal еще и становится previous,
            // а во второй итерации кладем в previousNode.next, что равнисельно в result.next
            // это позволяет в следующих итерациях класть новую ноду в придыдущую

            // смещаем указатели
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            // если это не последнее сложение - перетрется
            if (carry > 0) {
                previousNode.next = new ListNode(carry);
            }
        }
        return resultNode;
    }
}
