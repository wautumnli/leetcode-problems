package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/4/6 7:53 下午
 */
public class Jz53I {
    public int search(int[] nums, int target) {
        int result = 0;
        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                result = 1;
                break;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        if (mid == -1) {
            return result;
        }
        boolean leftFlag = true;
        boolean rightFlag = true;
        int l = mid - 1;
        int r = mid + 1;
        while (leftFlag || rightFlag) {
            if (leftFlag) {
                if (l >= 0 && nums[l] == target) {
                    result++;
                    l--;
                } else {
                    leftFlag = false;
                }
            }
            if (rightFlag) {
                if (r < nums.length && nums[r] == target) {
                    result++;
                    r++;
                } else {
                    rightFlag = false;
                }
            }
        }
        return result;
    }
}
