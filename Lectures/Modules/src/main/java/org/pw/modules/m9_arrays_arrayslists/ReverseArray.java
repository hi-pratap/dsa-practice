package org.pw.modules.m9_arrays_arrayslists;

public class ReverseArray {

    static int[] reverseArrayUsingTwoPointer(int[] arr) {
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        System.out.println();
        return arr;
    }

    static int[] reverseArrayUsingFor(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr.length - 1 - i;
            swap(arr, i, j);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        System.out.println();
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {80, 90, 70, 67, 33, 44, 55, 66, 11, 22, 33};
        printArray(arr);

        //Method 1: Using Normal For Loop
        // reverseArrayUsingFor(arr);
        //
        // Method 2: Using Two Pointers  //most Optimised
        reverseArrayUsingTwoPointer(arr);

        //Method 3: Using New Array
        // int[] ints = reverseArrayUsingThirdAnotherArray(arr);


        printArray(arr);
        //  printArray(arr);
    }

    private static int[] reverseArrayUsingThirdAnotherArray(int[] arr) {
        int[] ansArr = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            ansArr[j++] = arr[i];
        }
        return ansArr;
    }


}
