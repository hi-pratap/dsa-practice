package org.pw.modules.m6_loops;

import java.util.Scanner;

public class CheckNumberComposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number n: ");
        int n = scanner.nextInt();
        int x = 0; // prime
        for (int j = 2; j < n - 1; j++) {
            if (n % j == 0) {
                System.out.println(n + " is a Composite Number");
                x = 1;// composite
                break;
            }
        }
        if (n == 1) System.out.println("Neither Prime nor Composite");
        else if (x == 0) System.out.println("prime Number");
    }
}
