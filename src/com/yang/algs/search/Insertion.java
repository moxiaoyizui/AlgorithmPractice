package com.yang.algs.search;

/**
 * 插入排序
 *
 * @author yang
 */
public class Insertion {

    /**
     * @Author: Yang
     * @Des: 直接插入排序
     * @Date: 下午5:55 17-11-13
     **/
    public static void straight(int[] origin) {
        System.out.println("直接插入排序开始...");
        int size = origin.length;
        for (int i = 1; i < size;i++) {
            int j;
            int tar = origin[i];
            for (j = i; j >0 && tar < origin[j - 1]; j--) {
                origin[j] = origin[j - 1];
            }
            origin[j] = tar;
        }
    }

    /**
     * @Author: Yang
     * @Des: 二分插入排序
     * @Date: 下午5:55 17-11-13
     **/
    public static void binary(int[] origin) {
        //TODO 未完成
        System.out.println("二分插入排序开始...");
        int size = origin.length, left = 0, right = size - 1;
        int l, m, h, t;
        for (int i = left; i < right + 1; i++) {
            System.out.println("di "+i+" tang");
            t = origin[i];
            l = left + 1;
            h = right;
            while (l < h + 1) {
                m = (l + h)/2;
                System.out.println(m);
                if (t < origin[m]) {
                    h = m--;
                } else {
                    l = m++;
                }
            }
            for (int j = i -1; j >= l;j--) {
                origin[j + 1] = origin[j];
            }
            origin[l] = t;
        }
    }
}
