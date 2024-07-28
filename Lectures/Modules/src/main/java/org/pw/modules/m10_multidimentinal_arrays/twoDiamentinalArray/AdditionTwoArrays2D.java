package org.pw.modules.m10_multidimentinal_arrays.twoDiamentinalArray;

public class AdditionTwoArrays2D {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 5}, {2, 3, 6}, {4, 5, 9}};
        int[][] b = {{1, 2, 5}, {2, 3, 6}, {4, 5, 9}};
        int m = a.length;
        int n = a[0].length;
        int[][] sum = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
