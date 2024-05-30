package org.pw.modules.m5_conditional;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling price : ");
        int sp = sc.nextInt();
        if (cp < sp) System.out.println("Profit"+(sp-cp));
        if (cp > sp) System.out.println("Loss"+(cp-sp));
        if (cp == sp) System.out.println("No Loss, No profit");
    }
}
