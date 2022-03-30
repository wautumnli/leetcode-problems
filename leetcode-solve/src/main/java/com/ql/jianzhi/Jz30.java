package com.ql.jianzhi;

import java.util.Stack;

/**
 * @author wanqiuli
 * @date 2022/3/30 13:28
 */
public class Jz30 {

    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public Jz30() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (minStack.isEmpty() || minStack.peek() >= x) {
            stack.push(x);
            minStack.push(x);
            return;
        }
        stack.push(x);
    }

    public void pop() {
        int val = stack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.pop();
    }

    public int min() {
        return minStack.pop();
    }
}
