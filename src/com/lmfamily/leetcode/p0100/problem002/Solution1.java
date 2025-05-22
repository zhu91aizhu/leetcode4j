package com.lmfamily.leetcode.p0100.problem002;

public class Solution1 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = l1;
        while (true) {
            int sum = current.val;
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum > 9) {
                current.val = sum - 10;
                if (current.next == null) {
                    current.next = new ListNode(1);
                }
                else {
                    current.next.val += 1;
                }
            }
            else {
                current.val = sum;
            }

            if (current.next == null && l2 == null) {
                break;
            }
            else {
                if (current.next == null) {
                    current.next = new ListNode(0);
                }
            }

            current = current.next;
        }

        return l1;
    }

}
