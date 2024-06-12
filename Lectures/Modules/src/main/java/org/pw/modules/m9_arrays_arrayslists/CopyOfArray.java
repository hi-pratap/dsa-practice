package org.pw.modules.m9_arrays_arrayslists;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] srudent = {80, 90, 70, 67, 33, 44, 55, 66, 11, 22, 33, 65};
        for (int i : srudent) {
            System.out.print(i+" ");
        }
        int[] nums=srudent; //shallow-copy
        nums[0]=70;
        System.out.println("arr[0]: "+srudent[0]);
        for (int num : nums) {
            System.out.println(num+" ");
        }

        int[ ] deepCopy= Arrays.copyOf(srudent,srudent.length);
        deepCopy[0]=00;
        System.out.println("arr[0]: "+srudent[0]);
        System.out.println("  deepCopy[0]: "+deepCopy[0]);

    }
}
