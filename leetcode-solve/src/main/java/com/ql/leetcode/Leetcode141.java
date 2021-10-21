package com.ql.leetcode;

/**
 * @author wanqiuli
 */
public class Leetcode141 {
    public boolean hasCycle(ListNode head) {
        ListNode oneStep = head;
        ListNode twoStep = head;
        while ((oneStep != null) && (twoStep != null)) {
            if (twoStep.next == null) {
                break;
            }
            twoStep = twoStep.next.next;
            oneStep = oneStep.next;
            if (twoStep != null && oneStep == twoStep) {
                return true;
            }
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        boolean mountainRidge = true;
        boolean skuLanSeparate = true;
        int love = 0;
        while (mountainRidge && skuLanSeparate) {
            mountainRidge = skuLanSeparate = false;
        }
    }
}
