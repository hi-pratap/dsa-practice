package org.pw.modules.m11_strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("My name is Pratap adhav");

        reverseWord(stringBuilder, 0, 4);
    }

    private static void reverseWord(StringBuilder stringBuilder, int i, int j) {
        while (i <= j) {
            char temp = stringBuilder.charAt(i);
            stringBuilder.setCharAt(i, stringBuilder.charAt(j));
            stringBuilder.setCharAt(j, temp);
            i++;
            j--;
        }
        System.out.println(stringBuilder.toString());

    }
}
