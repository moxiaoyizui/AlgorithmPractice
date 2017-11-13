package com.yang.algs.search;

/**
 * 插入排序
 *
 * @author yang
 */
public class Insertion {

    /**
     * 直接插入排序
     * @param origin
     */
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
}
