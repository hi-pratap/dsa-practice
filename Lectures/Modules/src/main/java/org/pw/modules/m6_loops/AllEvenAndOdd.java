package org.pw.modules.m6_loops;

public class AllEvenAndOdd {
    public static void main(String[] args) {
        System.out.println("All even");

        //100 round
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(count++);
            if (i % 2 == 0) System.out.println(i + " Even");
        }
        //50 round
        count = 0;
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(count++);
            if (i % 2 == 0) System.out.println(i + " Even");
        }
    }
}
