package org.pw.modules.m5_conditional;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b && a >= c) System.out.println("Greater A " + a);
        else if (b >= a && b >= c) System.out.println("Greater B " + b);
        else System.out.println("Greater c " + c);


        if (a <= b && a <= c) System.out.println("less A " + a);
        else if (b <= a && b <= c) System.out.println("less B " + b);
        else System.out.println("less c " + c);

        System.out.println("Without Using && :");

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is Largest");
            } else {
                System.out.println(c + " is Largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is Largest");
            } else {
                System.out.println(c + " is Largest");
            }
        }
    }
}
