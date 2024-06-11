package org.pw.modules.m9_arrays_arrayslists;

import java.util.Scanner;

public class LinerSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 81, 23, 34, 45, 56, 57, 58};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }
        if (flag==true) {
            System.out.println("FOund");
        } else System.out.println("Not Found");
    }
}
