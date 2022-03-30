package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/30 9:43
 */
public class Jz15 {

    /**
     * todo 有其他最优方法
     *
     * @param n the n
     * @return the {@link int} data
     */
    public int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                res = res + 1;
            }
        }
        return res;
    }
}
