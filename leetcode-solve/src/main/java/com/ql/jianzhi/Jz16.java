package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/30 9:54
 */
public class Jz16 {

    /**
     * 快速幂
     *
     * @param x the x
     * @param n the n
     * @return the {@link double} data
     */
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        long b = n;
        if (n < 0) {
            x = 1 / x;
            b = -b;
        }
        double res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = res * x;
            }
            x = x * x;
            b = b >> 1;
        }
        return res;
    }
}
