package com.yang.algs.search;

/**
 * 冒泡排序
 *
 * @author yang
 */
public class Bubble {

    public static void base(int[] origin) {
        System.out.println("基本冒泡排序");
        int size = origin.length;
        for (int i = 0; i < size - 1;i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (origin[j] > origin[j + 1]) {
                    swap(origin, j, j+1);
                }
            }
        }
    }

    public static void enhanced_laststat(int[] origin) {
        System.out.println("增强版冒泡排序--完成标记");
        int size = origin.length;
        boolean lastStat = false;
        for (int i = 0; !lastStat && i < size - 1;i++) {
            lastStat = true;
            for (int j = 0; j < size - i - 1; j++) {
                if (origin[j] > origin[j + 1]) {
                    lastStat = false;
                    swap(origin, j, j+1);
                }
            }
        }
    }

    public static void enhanced_twoways(int[] origin) {
        System.out.println("增强版冒泡排序--双向");
        int size = origin.length;
        int high = size - 1;
        int low = 0;
        while (low < high) {
            for (int i = low; i < high;i++) {
                if (origin[i] > origin[i+1]) {
                    swap(origin, i, i+1);
                }
            }
            high--;

            for (int i = high; i > low;i--) {
                if (origin[i - 1] > origin[i]) {
                    swap(origin, i - 1, i);
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
