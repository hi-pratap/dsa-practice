package org.pw.modules.m10_multidimentinal_arrays.twoDiamentinalArray;

public class LargestElement {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {2, 3, 6}, {4, 5, 9}};
        int minValue = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;
        minValue = getMinValue(m, n, arr, minValue);
        System.out.println(minValue);
    }

    private static int getMinValue(int m, int n, int[][] arr, int minValue) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > minValue) {
                    minValue = arr[i][j];
                }
            }

        }
        return minValue;
    }

    //using math Functions
    private static int getMaxValue(int m, int n, int[][] arr, int minValue) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int max = Math.max(minValue, arr[i][j]);
            }

        }
        return minValue;
    }
}
