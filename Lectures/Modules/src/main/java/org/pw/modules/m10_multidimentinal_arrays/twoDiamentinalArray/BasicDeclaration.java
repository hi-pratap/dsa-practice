package org.pw.modules.m10_multidimentinal_arrays.twoDiamentinalArray;

public class BasicDeclaration {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 40;
        arr[1][1] = 50;
        arr[1][2] = 60;
        arr[2][0] = 70;
        arr[2][1] = 80;
        arr[2][2] = 90;
        int n = arr.length; // return no of rows
        System.out.println(n + " Rows");
        int n1 = arr[0].length;
        System.out.println(n1 + " Coloumn");
        for (int i = 0; i < arr.length; i++) { // for rows
            for (int j = 0; j < arr[i].length; j++) { // for Coloumn
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
