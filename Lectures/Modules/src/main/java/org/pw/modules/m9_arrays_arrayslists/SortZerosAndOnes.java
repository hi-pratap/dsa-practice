package org.pw.modules.m9_arrays_arrayslists;

import java.util.Arrays;

public class SortZerosAndOnes {
    public static void main(String[] args) {
//        int[] arr = {0, 0, 1, 0, 1, 1, 1, 0, 1, 0};
     int[] arr = {0, 0,0,0,0, 1, 1, 1, 1};
        int n = arr.length;
        // twoPassSolution(n, arr);
        onePassSolution(n, arr);

//        Arrays.stream(arr).forEach(System.out::print);
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }

    private static void onePassSolution(int n, int[] arr) {
        // Initialize two pointers: i= starting from the beginning of the array and j= starting from the end
        int i = 0, j = n - 1;

        // Loop until the two pointers meet
        while (i < j) {
            // If the element at i is already 0, move the i pointer to the right
            if (arr[i] == 0) i++;

            // If the element at j is already 1, move the j pointer to the left
            else if (arr[j] == 1) j--;

            // If the element at i is 1 and the element at j is 0, swap them
            else if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;         // Move the i pointer to the right
                j--;         // Move the j pointer to the left
            }
        }
    }



    private static void twoPassSolution(int n, int[] arr) {
        int noOfZeroes = 0, noOdOnes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) noOfZeroes++;
            //  else noOdOnes++;
        }
        for (int i = 0; i < n; i++) {
            if (i < noOfZeroes) arr[i] = 0;
            else arr[i] = 1;
        }
       /* for (int i = noOfZeroes; i < n; i++) {
            arr[i] = 1;
        }*/
    }
}
