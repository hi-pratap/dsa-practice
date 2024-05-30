package org.pw.modules.m5_conditional;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        int y = scanner.nextInt();
        int x = scanner.nextInt();

        if (x > 0 && y > 0)
            System.out.println("First Quadrant");
        else if (x < 0 && y < 0)
            System.out.println("Third Quadrant");
        else if (x < 0 && y > 0)
            System.out.println("Second Quadrant");
        else if (x > 0 && y < 0) System.out.println("Fourth Quadrant");
        else System.out.println("center");


    }
}
