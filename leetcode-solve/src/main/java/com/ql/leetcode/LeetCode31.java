package com.ql.leetcode;


/**
 * @author: wautumnli
 * @date: 2021-01-05 09:35
 * 31. 下一个排列
 **/
public class LeetCode31 {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1, 1, 3};
        new LeetCode31().nextPermutation(nums);
    }

    /***
     * 1.先找到非降序第一个数i
     * 2.再找第一个大于i的数，做交换。
     * 3。将i之后的数组做对称交换
     */
    public void nextPermutation(int[] nums) {
        int idx = 0;
        for (int i = nums.length-1; i >= 1 ; i--) {
            if (nums[i] > nums[i - 1]) {
                for (int j = i; j < nums.length; j++) {
                    if (j == nums.length-1 || ((nums[j] > nums[i -1]) && (nums[j+1] <= nums[i-1]))) {
                        int temp = nums[j];
                        nums[j] = nums[i-1];
                        nums[i-1] = temp;
                        break;
                    }
                }
                idx = i;
                break;
            }
            idx = i - 1;
        }

        for (int i = idx; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
