package org.pw.modules.m9_arrays_arrayslists;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {80, 90, 70, 67, 33, 44, 55, 66, 11, 22, 33};
        for (int i : arr) {
            System.out.print(i + " ");
        }

        int n = arr.length;
        int k = 2;
        // int i = 1, j = n - 3;

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
/*
*
 Reverse First Part of the Array

----------------reverse(nums, 0, n - k - 1);

This line calls the reverse method to reverse the first part of the array, from the start (0) to the index n - k - 1.

Reverse Second Part of the Array

---------------reverse(nums, n - k, n - 1);

*This line calls the reverse method to reverse the second part of the array, from the index n - k to the end of the array (n - 1).

Reverse the Entire Array

----------------reverse(nums, 0, n - 1);
This line calls the reverse method to reverse the entire array from the start (0) to the end (n - 1). After this step, the array will be rotated by k positions.

* */

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}