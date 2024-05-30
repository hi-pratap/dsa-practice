package org.pw.modules.m5_conditional;

import java.util.Scanner;

public class TriangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side: ");
        int a = sc.nextInt();
        System.out.print("Enter 2st side: ");
        int b = sc.nextInt();
        System.out.print("Enter 3st side: ");
        int c = sc.nextInt();

        if (((a + b) > c) && ((b + c) > a) && ((c + a) > b)) {
            System.out.println("Its a Triangle...!!!!!!");
        } else System.out.println("Not a Triangle... !!!");

    }
}
