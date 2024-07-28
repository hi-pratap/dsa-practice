package org.pw.modules.m10_multidimentinal_arrays.twoDiamentinalArray;

import java.util.Scanner;

public class StudentsAndMarks {
    public static void main(String[] args) {
        int[][] studentsDetails = new int[4][2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < studentsDetails.length; i++) {

            for (int j = 0; j < studentsDetails[0].length; j++) {
                studentsDetails[i][j] = scanner.nextInt();

            }
        }
        for (int i = 0; i < studentsDetails.length; i++) {

            for (int j = 0; j < studentsDetails[0].length; j++) {
                System.out.print(studentsDetails[i][j] + " ");

            }
            System.out.println();
        }

    }
}
