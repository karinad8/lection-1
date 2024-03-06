package hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("resources/text.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                int wordsCount = countOfWords(line);
                System.out.println("There are " + wordsCount + " worlds in this text");
                int punctuationMarksCount = countOfPunctuationMarks(line);
                System.out.println("There are " + punctuationMarksCount + " punctuation marks in this text");
            }
        } catch (IOException e) {
            System.out.println("Exception with message " + e.getMessage() + " occurred");
        }
    }

    public static int countOfWords(String line) {
        String stringPattern = "\\s";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(line);
        int spaceCount = 1;
        while (matcher.find()) {
            spaceCount++;
        }
        return spaceCount;
    }

    public static int countOfPunctuationMarks (String line) {
        String stringPattern = "[,.]";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(line);
        int punctuationMarkCount = 0;
        while (matcher.find()) {
            punctuationMarkCount++;
        }
        return punctuationMarkCount;
    }
}
