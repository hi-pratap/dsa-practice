package org.pw.modules.m8_pattern_printing.triangles.composite;

public class RhombusTriangle {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("0" + " ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


}