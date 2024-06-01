package org.pw.modules.m8_pattern_printing.square;

import java.util.Scanner;

public class NumberPrinting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {

                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }
}
