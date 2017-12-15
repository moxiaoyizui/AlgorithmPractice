package com.yang.algs.search;

/**
 * 快排
 *
 * @author yang
 */
public class Quick {

    public static void base(int[] origin) {
        sort(origin, 0, origin.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low <= high) {
            int mid = position(arr, low, high);
            sort(arr, low, mid - 1);
            sort(arr, mid+1, high);
        }
    }

    private static int position(int[] arr, int low, int high) {
        int key = arr[low];

        while (low < high) {
            while (high > low && arr[high] >= key) {
                high --;
            }
            arr[low] = arr[high];

            while (high > low && arr[low] <= key) {
                low ++;
            }
            arr[high] = arr[low];
        }

        arr[high] = key;

        return high;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
