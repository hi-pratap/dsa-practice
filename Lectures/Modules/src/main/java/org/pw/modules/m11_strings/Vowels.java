package org.pw.modules.m11_strings;

public class Vowels {


    public static void main(String[] args) {
        String name = "pratap adhav is smart dev";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (isVowels(c)) count++;
        }
        System.out.println("Total count: " + count);
general();
    }

        private static void general() {
            String s = "pratap";
            String t = "pratap";
            System.out.println(s.startsWith("prat"));

        }

    private static boolean isVowels(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
