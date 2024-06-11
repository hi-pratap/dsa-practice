package org.pw.modules.m9_arrays_arrayslists;

public class MaximumValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 81, 23, 34, 45, 56, 57, 58};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    secondMethod(arr);
    }

    private static void secondMethod(int[] arr) {
        int minValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > minValue) {
                minValue = arr[i];
            }
        }
        System.out.println(minValue);
    }

}
