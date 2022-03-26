package com.ql.leetcode;

/**
 * @author wanqiuli
 * @date 2022/3/26 13:10
 */
public class Lc1608 {

    public int specialArray(int[] nums) {
        int cur = nums.length + 1;
        for (int i = cur; i >= 0; i--) {
            int res = 0;
            for (int num : nums) {
                if (num >= i) {
                    res = res + 1;
                }
            }
            if (res == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 7, 7, 0};
        System.out.println(new Lc1608().specialArray(array));
    }
}
