package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/31 10:32
 */
public class Jz21 {
    public int[] exchange(int[] nums) {
        int val;
        int m = 0;
        int n = nums.length - 1;
        while (m < n) {
            while (m < n && (nums[m] & 1) == 1) {
                m++;
            }
            while (m < n && (nums[n] & 1) == 0) {
                n--;
            }
            val = nums[m];
            nums[m] = nums[n];
            nums[n] = val;
        }
        return nums;
    }
}
