package com.ql.jianzhi;

import java.util.Stack;

/**
 * @author wanqiuli
 * @date 2022/4/7 8:08 下午
 */
public class Jz31 {

    /**
     * function is validateStackSequences
     * todo 存在最优解
     *
     * @param pushed the pushed
     * @param popped the popped
     * @return the {@link boolean} data
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int push : pushed) {
            stack.push(push);
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
