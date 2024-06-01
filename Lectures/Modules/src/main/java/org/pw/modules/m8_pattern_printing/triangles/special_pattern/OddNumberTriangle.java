package org.pw.modules.m8_pattern_printing.triangles.special_pattern;

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            int a=1;
            for (int j = 1; j <=i; j++) {
                 System.out.print(a+" ");
                 a+=2;
            }
            System.out.println();
        }
    }
}
