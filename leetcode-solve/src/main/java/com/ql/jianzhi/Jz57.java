package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/11 21:28
 */
public class Jz57 {

    /**
     * todo 有可优化空间
     *
     * @param nums   the nums
     * @param target the target
     * @return the {@link int[]} data
     */
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[]{nums[i], nums[j]};
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return new int[]{};
    }
}
