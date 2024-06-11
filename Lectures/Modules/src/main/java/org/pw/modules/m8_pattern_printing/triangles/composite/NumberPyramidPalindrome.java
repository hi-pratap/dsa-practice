package org.pw.modules.m8_pattern_printing.triangles.composite;

public class NumberPyramidPalindrome {
    public static void main(String[] args) {

            int n = 5;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) { //spaces
                    System.out.print(" " + " ");
                }
                for (int j = 1; j <=  i; j++) { //starts
                  System.out.print(j+ " ");
                }

                for (int j = i-1; j >= 1; j--) { //starts
                  System.out.print(j+ " ");
                }
                System.out.println();
            }

    }
}
