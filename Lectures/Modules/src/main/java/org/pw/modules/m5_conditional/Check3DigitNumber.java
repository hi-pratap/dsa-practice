package org.pw.modules.m5_conditional;

import java.util.Scanner;

public class Check3DigitNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i > 99 && i < 1000) System.out.println("three digit number");
        else System.out.println("Not three digit number");

    }
}
