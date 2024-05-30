package org.pw.modules.m5_conditional;

import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int i = scanner.nextInt();
        if (i >= 80) System.out.println("Very Good");
        else if (i > 60) System.out.println(" Good");
        else if (i > 40) System.out.println("Averrage");
        else System.out.println("Fails");
    }
}
