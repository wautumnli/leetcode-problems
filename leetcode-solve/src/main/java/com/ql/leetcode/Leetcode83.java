package com.ql.leetcode;

public class Leetcode83 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode b = new ListNode(3, null);
        ListNode a = new ListNode(3, b);
        ListNode one = new ListNode(2, a);
        ListNode two = new ListNode(1, one);
        ListNode three = new ListNode(1, two);
        ListNode listNode = new Leetcode83().deleteDuplicates(three);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode aux = head;
        ListNode res = head;
        while (head != null) {
            if (res.val != head.val) {
                res.next = head;
                res = head;
            }
            if (head.next == null) {
                res.next = null;
            }
            head = head.next;
        }
        return aux;
    }
}
