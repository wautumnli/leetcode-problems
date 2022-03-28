package com.ql.jianzhi;

/**
 * @author wanqiuli
 * @date 2022/3/28 19:37
 */
public class Jz11 {
    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return numbers[left];
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 2, 0, 1};
        System.out.println(new Jz11().minArray(array));
    }
}
