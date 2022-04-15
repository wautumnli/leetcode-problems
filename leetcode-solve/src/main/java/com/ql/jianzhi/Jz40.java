package com.ql.jianzhi;


import java.util.Arrays;

/**
 * @author wanqiuli
 * @date 2022/4/15 12:40
 */
public class Jz40 {
    /**
     * TODO 自己怎么快排都不会了。。
     *
     * @param arr the arr
     * @param k   the k
     * @return the {@link int[]} data
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1, k);
        return Arrays.copyOf(arr, k);
    }

    private void quickSort(int[] arr, int l, int r, int k) {
        if (l >= r) {
            return;
        }
        int i = l;
        int j = r;
        int base = arr[l];
        while (i < j) {
            while (i < j && arr[j] >= base) {
                j--;
            }
            arr[i] = arr[j];
            while (i < j && arr[i] <= base) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = base;
        if (i < k) {
            quickSort(arr, i + 1, r, k);
        }
        if (i > k) {
            quickSort(arr, l, i - 1, k);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 2, 1};
        System.out.println(Arrays.toString(new Jz40().getLeastNumbers(array, 2)));
    }
}
