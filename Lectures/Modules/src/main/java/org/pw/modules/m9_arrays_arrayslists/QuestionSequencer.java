package org.pw.modules.m9_arrays_arrayslists;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionSequencer {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\12128\\Downloads\\ca66bf01-2b9c-4b42-9040-c42d36478043_Export-aa3dc163-2be6-4dce-a167-1d6e3c0c54e7\\Interview Questions List 65ce111b72a04cd0a8f4fa6133a554cd.md";

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            List<String> updatedLines = new ArrayList<>();
            Pattern patternQ = Pattern.compile("### Q\\d+\\. (.*)");
            Pattern patternN = Pattern.compile("\\*\\*(\\d+)\\) (.*)");
            Pattern patternO = Pattern.compile("\\*\\*(\\d+)\\*\\*\\. (.*)");
            Pattern patternP = Pattern.compile("### \\*\\*(\\d+)\\) (.*)");
            Pattern patternQ2 = Pattern.compile("### \\*\\*Q \\d+\\) (.*)");

            int questionNumber = 1;

            for (String line : lines) {
                Matcher matcherQ = patternQ.matcher(line);
                Matcher matcherN = patternN.matcher(line);
                Matcher matcherO = patternO.matcher(line);
                Matcher matcherP = patternP.matcher(line);
                Matcher matcherQ2 = patternQ2.matcher(line);


                if (matcherQ.matches()) {
                    String question = matcherQ.group(1);
                    updatedLines.add("### Q" + questionNumber + ". " + question);
                } else if (matcherN.matches()) {
                    String question = matcherN.group(2);
                    updatedLines.add("**" + questionNumber + ") " + question);
                } else if (matcherO.matches()) {
                    String question = matcherO.group(2);
                    updatedLines.add("**" + questionNumber + "**. " + question);
                } else if (matcherP.matches()) {
                    String question = matcherP.group(2);
                    updatedLines.add("### **" + questionNumber + ") " + question);
                } else if (matcherQ2.matches()) {
                    String question = matcherQ2.group(1);
                    updatedLines.add("### **Q " + questionNumber + ") " + question);
                }else {
                    updatedLines.add(line);
                    continue;
                }
                questionNumber++;
            }


            // Write the updated content back to the file
            Files.write(Paths.get(filePath), updatedLines);
            System.out.println("Questions have been renumbered successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}