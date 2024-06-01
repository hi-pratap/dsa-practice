package org.pw.modules.m8_pattern_printing.triangles.special_pattern;

import java.util.Scanner;

public class FloyedTraingleSpecialPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int a=1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }

            System.out.println();
        }
    }
}
