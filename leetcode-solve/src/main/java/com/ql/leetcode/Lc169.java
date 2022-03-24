package com.ql.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author wanqiuli
 * @date 2022/3/24 12:50
 */
public class Lc169 {
    /**
     * 算法前提是众数必须占超过一半的数据
     *
     * @param nums the nums
     * @return the {@link int} data
     */
    public int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            count += (num == res) ? 1 : -1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 5};
        System.out.println(new Lc169().majorityElement(arr));
    }
}
