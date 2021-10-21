package com.ql.leetcode;

import com.ql.pojo.ListNode;

/**
 * @author: wautumnli
 * @date: 2021-01-12 09:27
 * 21. 合并两个有序链表
 **/
public class LeetCode21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode pre = new ListNode(-1);
        ListNode prev = pre;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        prev.next = l1 == null ? l2 : l1;
        return pre.next;
    }
}
