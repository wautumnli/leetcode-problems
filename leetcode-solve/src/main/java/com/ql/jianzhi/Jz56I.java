package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/26 20:01
 */
public class Jz56I {

    public int[] singleNumbers(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res = res ^ num;
        }
        int div = 1;
        while ((res & div) == 0) {
            div = div << 1;
        }
        int x = 0;
        int y = 0;
        for (int num : nums) {
            if ((num & div) == 0) {
                x = x ^ num;
            } else {
                y = y ^ num;
            }
        }
        return new int[]{x, y};
    }
}
