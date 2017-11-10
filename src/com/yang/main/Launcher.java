package com.yang.main;

import java.util.List;

public class Launcher {
    public static void main(String[] args){
        int[] origin = {1,2,8,1234896,486,456123,456,354,218574,12851,84533,45642313,423185,1260,564045,1546,456,-4231,8108};
        System.out.println("排序前:");
        print(origin);
        System.out.println("\n排序后:");
        print(origin);
    }

    private static void print(int[] target) {
        int counter = 0;
        for (int num : target) {
            System.out.print(num);
            if (counter++ % 10 == 9) {
                System.out.println("");
            } else {
                System.out.print(",");
            }
        }
    }
}

