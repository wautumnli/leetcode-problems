package com.ql.jianzhi;

import com.ql.pojo.ListNode;

import java.util.Arrays;
import java.util.Stack;


/**
 * @author wanqiuli
 * @date 2022/3/28 12:38
 */
public class Jz6 {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] array = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            array[i++] = stack.pop();
        }
        return array;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode();
        node.val = 1;
        ListNode node1 = new ListNode();
        node1.val = 2;
        node.next = node1;
        System.out.println(Arrays.toString(new Jz6().reversePrint(node)));
    }
}
