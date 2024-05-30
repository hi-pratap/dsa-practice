package org.pw.modules.m5_conditional;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The lenghth: ");
        int l = scanner.nextInt();
        System.out.println("Enter The Breadth: ");
        int b = scanner.nextInt();
        int area = l * b;
        int perimerter = 2 * (l * b);
        if (area > perimerter) System.out.println("area is greater");
        if (area < perimerter) System.out.println("area is small");
    }
}
