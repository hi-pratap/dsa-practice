package org.pw.modules.m11_strings;

import java.util.Arrays;

public class ValidAnnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String s1 = "nagaram";
        boolean b = checkAnnagram(s, s1);
        System.out.println(b);
    }

    private static boolean checkAnnagram(String s, String s1) {
        char[] charArray = s.toCharArray();
        char[] charArray1 = s1.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray);
        return Arrays.equals(charArray1, charArray);
    }
}
