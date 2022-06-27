package com.ql.jianzhi;

import com.ql.pojo.ListNode;

/**
 * @author wanqiuli
 * @date 2022/4/11 21:09
 */
public class Jz52 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
