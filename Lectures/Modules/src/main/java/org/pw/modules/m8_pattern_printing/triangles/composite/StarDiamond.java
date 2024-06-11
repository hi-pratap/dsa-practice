package org.pw.modules.m8_pattern_printing.triangles.composite;

public class StarDiamond {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
          /*  for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*" + " ");
            }*/
            System.out.println();
        }
        for (int i = 1; i <= n-1; i++) {
            for (int j = 0; j < n+1-i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j < n+1-i; j++) {
                System.out.print("*" + " ");
            }
          /*  for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*" + " ");
            }*/
            System.out.println();
        }
    }
}
