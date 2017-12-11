package com.yang.algs.search;

/**
 * 选择选择排序
 *
 * @author yang
 */
public class Selection {

    public static void base(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int lowindex = i;
            for (int j = i+1; j < arr.length;j++) {
                if (arr[lowindex] > arr[j]) {
                    lowindex = j;
                }
            }

            swap(arr, lowindex, i);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
