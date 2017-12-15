package com.yang.algs.search;

/**
 * 归归并排序
 *
 * @author yang
 */
public class Merge {

    public static void base(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        int mid = (low + high)/2;
        if (low < high) {
            sort(arr, low, mid);
            sort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid +1;
        int k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[i++];
        }

        for(int t = 0; t < temp.length;t++) {
            arr[low+t] = temp[t];
        }
    }

}
