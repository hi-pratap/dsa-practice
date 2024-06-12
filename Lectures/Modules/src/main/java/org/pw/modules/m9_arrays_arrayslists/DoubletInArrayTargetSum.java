package org.pw.modules.m9_arrays_arrayslists;

public class DoubletInArrayTargetSum {
    public static void main(String[] args) {
        int[] arr = {80, 90, 70, 67, 33, 44, 55, 66, 11, 22, 33, 65};
        int target = 122;
        for (int i = 0; i < arr.length; i++) {

            int remaining = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) System.out.println(arr[i] + " " + arr[j]);
            }
        }

    }
}
