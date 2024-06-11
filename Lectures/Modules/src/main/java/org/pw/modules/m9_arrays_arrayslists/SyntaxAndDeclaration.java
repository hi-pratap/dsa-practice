package org.pw.modules.m9_arrays_arrayslists;

public class SyntaxAndDeclaration {
    public static void main(String[] args) {
        // declare
        int[] arr = new int[100];

        //using another way initialization
        int[] newWay = {12, 3, 4, 5, 6};


        //output of array

        System.out.println(arr[4]);
        //get input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        //get output of array using loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
