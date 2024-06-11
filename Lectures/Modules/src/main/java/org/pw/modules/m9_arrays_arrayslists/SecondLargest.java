package org.pw.modules.m9_arrays_arrayslists;

import java.util.Arrays;
import java.util.Comparator;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 81, 23, 34, 45, 56, 57, 58};
        myWay(arr);
        usingStream(arr);
    }

    private static void usingStream(int[] arr) {

        Arrays.stream(arr).boxed().sorted((a,b)->b-a).skip(1).limit(1).forEach(System.out::println);
    }

    private static void myWay(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            else if (arr[i] > secondMax && arr[i] != max) secondMax = arr[i];

        }
        System.out.println(max + " " + secondMax);
    }
}
