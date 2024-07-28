package org.pw.modules.m11_strings;

public class StringToggle {
    //use ascai value differnce between samll and uoercase is 32
    //a=65
    public static void main(String[] args) {
        String string = "AbCdEfGh";

        StringBuilder builder = new StringBuilder(string);

        for (int i = 0; i < string.length(); i++) {
            char ch = builder.charAt(i);
            int ascii = ch;
            if (ascii <= 90 && ascii >= 65) ascii += 32;
            else if (ascii >= 97 && ascii <= 122) ascii -= 32;


            ch = (char) ascii;
            builder.setCharAt(i, ch);
        }
        System.out.println(builder);

    }
}
