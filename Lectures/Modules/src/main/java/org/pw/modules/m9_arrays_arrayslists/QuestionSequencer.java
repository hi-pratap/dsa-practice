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


        String filePath="C:\\Users\\12128\\OneDrive - IZ\\Desktop\\input.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            List<String> updatedLines = new ArrayList<>();
            Pattern pattern = Pattern.compile("### Q\\d+\\. (.*)");
            int questionNumber = 1;

            for (String line : lines) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    String question = matcher.group(1);
                    updatedLines.add("### Q" + questionNumber + ". " + question);
                    questionNumber++;
                } else {
                    updatedLines.add(line);
                }
            }

            // Write the updated content back to the file
            Files.write(Paths.get(filePath), updatedLines);
            System.out.println("Questions have been renumbered successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



