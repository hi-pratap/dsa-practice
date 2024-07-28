package org.pw.modules.Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamApi {
    public static void main(String[] args) {
        separateEvenAndOddNumber();
        System.out.println("Find Duplicate Using Stream");
        findDuplicateElementInArray();

        System.out.println("Count Charrector in String");
        countCharrectorInString();
        System.out.println("word Frequency ");

        wordFrequency();
        System.out.println("first Repeated Character ");
        firstRepeatedCharacter();
    }


    private static void firstRepeatedCharacter() {
        String word = "rohttoh";
        System.out.println(Arrays.stream(word.split(""))
                .filter(str -> word.indexOf(str) != word.lastIndexOf(str))
                .findFirst().orElse(""));
    }

    private static void wordFrequency() {
        List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
        Map<String, Long> frequencyWords = names.stream()
                .collect(groupingBy(Function.identity(), counting()));
        System.out.println(frequencyWords);
    }

    private static void countCharrectorInString() {
        String s = "Count Charrector in String";
        String[] split = s.split("");

        Map<String, Long> collect = Arrays.stream(split).collect(groupingBy(Function.identity(), counting()));
        System.out.println(collect);
//        List<Long> collect1 = collect.values().stream().sorted()..collect(Collectors.toList());
//        System.out.println("New SOrted "+collect1);

    }

    private static void findDuplicateElementInArray() {
        int[] arr = {12, 3, 3, 4, 5, 6, 7, 8, 9};

        //one  way
        List<Integer> collect = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
        System.out.println(collect);


    }


    private static void separateEvenAndOddNumber() {
        int[] arr = {12, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> collect = Arrays.stream(arr).boxed().filter(I -> I % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
