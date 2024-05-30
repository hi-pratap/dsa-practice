package org.pw.modules.m5_conditional;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int i = scanner.nextInt();

        if(i%2==0) System.out.println("Number is even");
        else System.out.println("Not even");
    }
}
