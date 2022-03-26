package com.ql.leetcode;

import com.ql.pojo.ListNode;

/**
 * @author wanqiuli
 * @date 2022/3/26 13:30
 */
public class Lc2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int cur = 0;
        while (l1 != null || l2 != null) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int val = v1 + v2 + cur;
            if (head == null) {
                head = new ListNode(val % 10);
                tail = head;
            } else {
                tail.next = new ListNode(val % 10);
                tail = tail.next;
            }
            cur = val / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (cur > 0) {
            tail.next = new ListNode(cur);
        }
        return head;
    }
}
