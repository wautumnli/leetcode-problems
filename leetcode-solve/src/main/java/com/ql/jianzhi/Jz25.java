package com.ql.jianzhi;

import com.ql.pojo.ListNode;

/**
 * @author wanqiuli
 * @date 2022/4/1 9:26
 */
public class Jz25 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 != null ? l1 : l2;
        return head.next;
    }

    public static void main(String[] args) {
    }
}
