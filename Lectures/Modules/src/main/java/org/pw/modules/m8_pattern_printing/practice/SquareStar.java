package org.pw.modules.m8_pattern_printing.practice;

public class SquareStar {
    public static void main(String[] args) {
        int n = 5;
        squre(n);
//        System.out.println("Trinagle Inverted");
//        triangleInverted(n);
//        System.out.println("Trinagle Inverted");
//        trianglePlain(n);
//        System.out.println("Star Bridge ");
//        starBridge(n);
    }

    private static void starBridge(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("*" + " ");
        }
        n--;
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1 - i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 0; j < n + 1 - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

    }


    private static void triangleInverted(int n) { //* * * *
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    private static void trianglePlain(int n) { //* * * *
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }

    }

    private static void squre(int n) {
        n = 9;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }

            for (int j = 0; j < n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
