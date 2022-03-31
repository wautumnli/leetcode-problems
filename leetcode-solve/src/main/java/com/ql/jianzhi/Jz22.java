package com.ql.jianzhi;

import com.ql.pojo.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanqiuli
 * @date 2022/3/31 12:09
 */
public class Jz22 {
    Map<Integer, ListNode> nodeMap = new HashMap<>();

    /**
     * todo 空间还可优化
     *
     * @param head the head
     * @param k    the k
     * @return the {@link ListNode} data
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int i = 1;
        while (head != null) {
            nodeMap.put(i++, head);
            head = head.next;
        }
        i = i - 1;
        return nodeMap.get(i - k + 1);
    }
}
