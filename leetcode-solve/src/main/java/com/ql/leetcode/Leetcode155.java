package com.ql.leetcode;

/**
 * @author wanqiuli
 */
public class Leetcode155 {

    class MinStack {

        ListNode top;

        public MinStack() {
        }

        public void push(int val) {
            if (top == null) {
                top = new ListNode(val, val, null);
            } else {
                ListNode node = new ListNode(val, 0, top);
                node.min = Math.min(val, top.val);
                top = node;
            }
        }

        public void pop() {
            if (top != null) {
                top = top.next;
            }
        }

        public int top() {
            return top.val;
        }

        public int getMin() {
            return top.min;
        }
    }

    class ListNode {
        int val;
        int min;
        ListNode next;

        ListNode(int val, int min, ListNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

}
