package com.ql.leetcode;

/**
 * @author: wautumnli
 * @date: 2021-01-02 17:18
 * 440. 字典序的第K小数字
 **/
public class LeetCode440 {

    public static void main(String[] args) {
        System.out.println(new LeetCode440().findKthNumber(13, 10));
    }

    public int findKthNumber(int n, int k) {
        //current 表示当前前缀节点
        int current = 1;
        //因为 1 <= k <= n <= 10^9 所以删除0节点
        k = k - 1;
        while (k > 0) {
            //寻找当前节点下在1..n范围内有多少个节点
            int num = findNode(n, current , current + 1);
            if (num > k ) {
                //表示在当前节点下
                current = current * 10;
                //删除当前节点
                k--;
            } else {
                //表示不在当前节点下
                current = current + 1;
                k = k - num;
            }
        }
        //返回当前节点
        return current;
    }

    //此时的first 和 last使用long是因为，最大范围是10^9 如果再*10 int是存不了的
    public int findNode(int n, long first, long last) {
        int num = 0;
        while (first <= n) {
            num += Math.min(n+1, last) - first;
            first = first * 10;
            last = last * 10;
        }
        return num;
    }

}
