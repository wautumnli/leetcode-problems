package com.ql.model;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author: wautumnli
 * @date: 2021-01-05 17:38
 * 快排
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {1,3,1,4,5,6,1,2,4,6,3};
        new QuickSort().quickSort(array,0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public void quickSort(int[] array, int left, int right) {
        if (left > right) return;
        int key = array[left];
        int i = left;
        int j = right;
        while (i < j) {
            //此处必须右边先移动，因为选择的基准值是最左
            while (array[j] >= key && i < j) {
                j--;
            }
            while (array[i] <= key && i < j) {
                i++;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        array[left] = array[i];
        array[i] = key;
        quickSort(array, left, j-1);
        quickSort(array, j+1, right);
    }
}
