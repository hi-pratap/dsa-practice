package org.pw.modules.m9_arrays_arrayslists;

public class PrintRollNumber {
    public static void main(String[] args) {
        int[] srudent = {80, 90, 70, 67, 33, 44, 55, 66, 11, 22, 33, 65};
        for (int i = 0; i < srudent.length; i++) {
            if (srudent[i] < 35) System.out.println(i);

        }
    }
}
