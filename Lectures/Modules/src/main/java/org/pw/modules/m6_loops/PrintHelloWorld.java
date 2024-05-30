package org.pw.modules.m6_loops;

import java.util.Scanner;

public class PrintHelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("count: ");
        int i = scanner.nextInt();
        for (int j = 0; j <= i; j++) {
            System.out.println(j + " Hello World");
        }

    }
}
