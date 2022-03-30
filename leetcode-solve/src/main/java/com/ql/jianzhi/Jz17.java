package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/30 12:09
 */
public class Jz17 {
    public int[] printNumbers(int n) {
        int val = (int) (Math.pow(10, n)) - 1;
        int[] array = new int[val];
        for (int i = 1; i <= val; i++) {
            array[i - 1] = i;
        }
        return array;
    }
}
