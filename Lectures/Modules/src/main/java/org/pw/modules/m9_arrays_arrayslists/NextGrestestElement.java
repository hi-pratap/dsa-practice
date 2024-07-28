package org.pw.modules.m9_arrays_arrayslists;

public class NextGrestestElement {
    public static void main(String[] args) {
        int[] arr = {2, 43, 5, 43, 76, 8, 9, 7, 67, 57};
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        bruteForceMethod(n, arr);
    }

    private static void bruteForceMethod(int n, int[] arr) {
        int[] ans = new int[n];
        for (int i = 0; i < n - 1; i++) {
            int minValue = Integer.MIN_VALUE;
            for (int j = i + 1; j < n; j++) {
                minValue = Math.max(minValue, arr[j]);
            }
            ans[i] = minValue;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
