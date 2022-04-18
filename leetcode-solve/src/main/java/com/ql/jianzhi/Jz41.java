package com.ql.jianzhi;


import java.util.PriorityQueue;
import java.util.Queue;

/**
 * TODO 不是最优的
 *
 * @author wanqiuli
 * @date 2022/4/15 18:21
 */
public class Jz41 {

    Queue<Integer> a, b;

    public Jz41() {
        a = new PriorityQueue<>();
        b = new PriorityQueue<>((x, y) -> y - x);
    }

    public void addNum(int num) {
        if (a.size() != b.size()) {
            a.add(num);
            b.add(a.poll());
        } else {
            b.add(num);
            a.add(b.poll());
        }
    }

    public double findMedian() {
        if (a.size() == b.size()) {
            return (a.peek() + b.peek()) / 2.0;
        } else {
            return a.peek();
        }
    }
}
