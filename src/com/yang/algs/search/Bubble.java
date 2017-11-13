package com.yang.algs.search;

/**
 * 冒泡排序
 *
 * @author yang
 */
public class Bubble {

    private int[] arr;

    public Bubble(int[] arr) {
        this.arr = arr;
    }

    public void base() {
        System.out.println("基本冒泡排序");
        int size = arr.length;
        for (int i = 0; i < size - 1;i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public void enhanced_laststat() {
        System.out.println("增强版冒泡排序--完成标记");
        int size = arr.length;
        boolean lastStat = false;
        for (int i = 0; !lastStat && i < size - 1;i++) {
            lastStat = true;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    lastStat = false;
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public void enhanced_twoways() {
        System.out.println("增强版冒泡排序--双向");
        int size = arr.length;
        int high = size - 1;
        int low = 0;
        while (low < high) {
            for (int i = low; i < high;i++) {
                if (arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
            high--;

            for (int i = high; i > low;i--) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                }
            }
            low++;
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
