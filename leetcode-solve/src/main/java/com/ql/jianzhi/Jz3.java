package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/26 15:07
 */
public class Jz3 {
    public int findRepeatNumber(int[] nums) {
        int[] last = new int[nums.length];
        for (int i = 0; i < last.length; i++) {
            last[i] = -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (last[nums[i]] != -1) {
                return nums[i];
            }
            last[nums[i]] = nums[i];
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] array = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(new Jz3().findRepeatNumber(array));
    }
}
