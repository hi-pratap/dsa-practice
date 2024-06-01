package org.pw.modules.m6_loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        int count = 0;
        int sum = 0;
        while (i != 0) {
            int remainder = i % 10;
            sum += remainder;
            i /= 10;
            count++;
        }
        System.out.println("\n \t"+sum);
    }
}
