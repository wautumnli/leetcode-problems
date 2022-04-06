package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/6 8:03 下午
 */
public class Jz53II {
    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}
