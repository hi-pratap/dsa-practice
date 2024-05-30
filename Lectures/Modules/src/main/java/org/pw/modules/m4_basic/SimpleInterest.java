package org.pw.modules.m4_basic;

public class SimpleInterest {
    public static void main(String[] args) {
        double principle=2000;
        double rate=3.75;
        double time=3.5;

        double si=(principle*rate*time)/100;
        System.out.println("Simple Interest is: "+si);

    }
}
