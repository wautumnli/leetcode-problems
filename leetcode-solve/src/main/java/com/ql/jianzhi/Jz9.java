package com.ql.jianzhi;

import java.util.Stack;

/**
 * @author wanqiuli
 * @date 2022/3/28 18:25
 */
public class Jz9 {
    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    public Jz9() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // todo 待优化
    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.isEmpty() ? -1 : stack2.pop();
    }
}
