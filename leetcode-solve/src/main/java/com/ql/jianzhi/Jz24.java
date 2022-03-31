package com.ql.jianzhi;

import com.ql.pojo.ListNode;

/**
 * @author wanqiuli
 * @date 2022/3/31 9:48
 */
public class Jz24 {
    public ListNode reverseList(ListNode head) {
        ListNode front = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode node = cur;
            cur = cur.next;
            node.next = front;
            front = node;
        }
        return front;
    }
}
