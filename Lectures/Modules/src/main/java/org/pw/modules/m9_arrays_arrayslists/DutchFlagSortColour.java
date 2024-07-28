package org.pw.modules.m9_arrays_arrayslists;

public class DutchFlagSortColour {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 2, 1, 2, 0, 1, 0, 2, 0, 2, 1, 2, 1, 2, 1, 0, 0, 0};

        // mid low hi
        // low-----low-1 mid------mid-1 high------high-1
        //0000000 12112120121 2222222

        //   methodOneUsingBrutForce(arr);
        methodTwoUsingDutchFlagAlgo(arr);
    }

    private static void methodTwoUsingDutchFlagAlgo(int[] arr) {
        int mid = 0, low = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                //  swapArr(arr[low], arr[mid]);
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) mid++;
            else if (arr[mid] == 2) {
                //  swapArr(arr[mid], arr[high]);
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static void swapArr(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

    private static void methodOneUsingBrutForce(int[] arr) {
        int n = arr.length;
        int noOfZeros = 0;
        int noOfOnes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) noOfZeros++;
            else if (arr[i] == 1) noOfOnes++;
        }
        int[] ans = new int[n];
        System.out.println("ZerOs: " + noOfZeros + " 1's: " + noOfOnes);
        for (int i = 0; i < n; i++) {
            if (i < noOfZeros) ans[i] = 0;
            else if (i < noOfOnes + noOfZeros) ans[i] = 1;
            else ans[i] = 2;
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
