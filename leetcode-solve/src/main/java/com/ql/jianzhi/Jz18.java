package com.ql.jianzhi;

import com.ql.pojo.ListNode;

/**
 * @author wanqiuli
 * @date 2022/3/30 12:14
 */
public class Jz18 {
    public ListNode deleteNode(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode headNode = head;
        ListNode front = head;
        while (head != null) {
            if (head.val == val) {
                front.next = head.next;
            } else {
                front = head;
            }
            head = head.next;
        }
        return headNode;
    }
}
