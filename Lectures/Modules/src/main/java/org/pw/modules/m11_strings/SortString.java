package org.pw.modules.m11_strings;

import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {

        // charector array can be sorted
        String s="PraatapaAamsasa";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        for (char c : charArray) {
            System.out.print(c);
        }}
}
