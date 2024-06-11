package org.pw.modules.m8_pattern_printing.triangles.composite;

public class PyramidComposite {
    public static void main(String[] args) {
        int n = 16;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) { //spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { //starts
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
