package com.ql.leetcode;

/**
 * @author: wautumnli
 * @date: 2021-01-04 09:19
 * 69. x 的平方根
 **/
public class LeetCode49 {

    public static void main(String[] args) {
        System.out.println(new LeetCode49().mySqrt(15));
    }

    /**
     * √x = e^(1/2 * lnx)
     * 复杂的O(1)
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        int res = (int) Math.exp(Math.log(x) * 0.5);
        return (long) (res + 1) * (res + 1) <= x ? res + 1 : res;
    }
}
