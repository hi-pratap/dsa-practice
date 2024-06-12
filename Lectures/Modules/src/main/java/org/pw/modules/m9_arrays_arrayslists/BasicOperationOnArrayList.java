package org.pw.modules.m9_arrays_arrayslists;

import java.util.ArrayList;
import java.util.List;

public class BasicOperationOnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0, 1);
        list.add(1, 12);
        list.add(2, 13);
        list.add(3, 14);
        list.add(4, 15);
        list.add(5, 16);
        list.set(0, 10);
        System.out.println(list);
    }
}
