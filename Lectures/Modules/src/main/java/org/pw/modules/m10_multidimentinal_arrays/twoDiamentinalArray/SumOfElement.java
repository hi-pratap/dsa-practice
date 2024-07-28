package org.pw.modules.m10_multidimentinal_arrays.twoDiamentinalArray;

public class SumOfElement {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {2, 3, 6}, {4, 5, 9}};
        int m = arr.length;
        int n = arr[0].length;
        int sum = getMinValue(m, n, arr);
        System.out.println(sum);
    }

    private static int getMinValue(int m, int n, int[][] arr) {
        int sum = 0;

        for (int i = 0; i < m; i++) {
            int separateSum = 0;
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
                separateSum += arr[i][j];
                System.out.print(arr[i][j]);
                if (j < n - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + separateSum);

        }
        return sum;
    }

}
