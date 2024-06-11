package org.pw.modules.m8_pattern_printing.triangles.composite;

public class StartTriangleFlipped {
    public static void main(String[] args) {
      /*  for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=5 ; j++) {
                if((i+j>5))System.out.print("* ");
                else System.out.print(" "+" ");
            }
            System.out.println();
        }*/


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" " +" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");

            }

            System.out.println();
        }
    }
}
