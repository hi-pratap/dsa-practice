package org.pw.modules.m6_loops;

public class PrintOddWithContinue {
    public static void main(String[] args) {
        //100 iteration
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }

        System.out.println("Less Iteration");
        //50 iteration
        for (int j = 2; j <= 100; j += 2) {
            System.out.println(j);
        }


    }


}
