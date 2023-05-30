package com.octavian.operationsandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int a = 50;
        int limit = 50;

        while (a > 0) {
            System.out.println(a);
            a--;
        }

        System.out.println();

        do {
            System.out.println(a);
            a++;
        } while (a < limit);
        System.out.println();

        System.out.println();

       for (a = 1; a <= limit; a++) {
           if (a % 2 == 0) {
               System.out.println(a + ",");
           }
           else
            System.out.print( "[],");
        }

    }
}
