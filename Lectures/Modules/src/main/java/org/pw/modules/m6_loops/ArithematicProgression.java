package org.pw.modules.m6_loops;

import java.util.Scanner;

public class ArithematicProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENter N: ");
        int i1 = scanner.nextInt();
        //1 3 5 7 9

        for (int i = 1; i <= 2 * i1 - 1; i += 2) {
            System.out.println(i);
        }
        System.out.println("Without Math");
        int a = 1;
        for (int i = 1; i <=i1; i ++) {
            System.out.println(a);
            a -= 2;
        }

        System.out.println("Geometric  Math");
        int ab= 1,d=4;
        for (int i = 1; i <=i1; i ++) {
            System.out.println(ab);
            ab *= d;
        }
    }
}
