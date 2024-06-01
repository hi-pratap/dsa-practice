package org.pw.modules.m8_pattern_printing.triangles.special_pattern;

public class StarPlus {
    public static void main(String[] args) {
        int n = 5;
        int mid = (n / 2) + 1;
        System.out.println(mid);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (mid == j || mid == i) System.out.print("* ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }
    }
}
