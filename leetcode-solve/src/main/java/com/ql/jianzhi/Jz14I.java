package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/29 10:13
 */
public class Jz14I {
    public int cuttingRope(int n) {
        // todo 需要推导该数学公式
        // todo dp方法解决
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3;
        int b = n % 3;
        if (b == 0) {
            return (int) Math.pow(3, a);
        }
        if (b == 1) {
            return (int) Math.pow(3, a - 1) * 4;
        }
        return (int) Math.pow(3, a) * 2;
    }
}
