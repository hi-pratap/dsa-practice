package org.pw.modules.Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AshokItStreamApi {


    // 1 Number of occurence of each charector
    public static void correctorOccurrence() {
        String name = "Pratap Adhav Borgao";
        String[] split = name.split("");
        Map<String, Long> collect = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);


    }

    // 2 Duplicate Element From given String
    public static void duplicateElements() {
        String name = "Pratap Adhav Borgao";
        String[] split = name.split("");
        List<String> collect = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Duplicate Element" + collect);


    }

    //first non repeated element
    public static void fisrtNonRepeated() {
        String name = "Pratap Adhav Borgao";
        String[] split = name.split("");
        String collect = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .get().getKey();
        System.out.println("First Non Repeated Element" + collect);


    }


//seconf Highets NUmber From Array

    public static void secondHighest() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer i = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Second Highest Element" + i);
    }

    // Longest String from given Array
    public static void longetsSTring() {
        String[] arr = {"hello", "Preatap", "Adhav", "How", "are", "youBoyshehe"};
        String s = Arrays.stream(arr)
                .reduce((w1, w2) -> w1.length() > w2.length() ? w1 : w2).get();

        System.out.println("Lonest String Element: " + s);
    }

    //find all element from array start with charector k
    public static void allElementThatStartWIthK() {
        int[] arr = {1, 12, 13, 4, 15, 6, 17, 8};
        List<String> list = Arrays.stream(arr)
                .boxed()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("1")).collect(Collectors.toList());

        System.out.println("array start with charector 1: " + list);
    }

    // Join Number arrays with delimeter

    public static void joinNumberArraysWithDelimeter() {
        int[] arr = {1, 12, 13, 4, 15, 6, 17, 8};
        List<String> list = Arrays.stream(arr)
                .boxed()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("1")).collect(Collectors.toList());
        String join = String.join("-", list);

        System.out.println("Join Number arrays with delimeter: " + join);
    }

    public static void main(String[] args) {
        correctorOccurrence();
        duplicateElements();
        fisrtNonRepeated();
        secondHighest();
        longetsSTring();
        allElementThatStartWIthK();
        joinNumberArraysWithDelimeter();
    }
}
