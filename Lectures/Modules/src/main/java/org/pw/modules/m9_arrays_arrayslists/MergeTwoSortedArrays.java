package org.pw.modules.m9_arrays_arrayslists;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {11, 33, 42, 71, 87};
        int[] b = {26, 54, 69, 81, 88, 91};

        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
//main Loop
        while (a.length > i && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) {
            //now take element from b only
            while (j < b.length) {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (j == b.length) {
            //now take element from a only
            while (i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
        }
//        if(){
//
//        }
        Arrays.stream(c).forEach(System.out::println);
    }
}
