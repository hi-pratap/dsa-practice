package org.pw.modules.m5_conditional;

import java.util.Scanner;

public class AbsoluteValues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        if(i>0){
            System.out.println(i);
        }else {
            System.out.println(-i);
        }
    }
}
