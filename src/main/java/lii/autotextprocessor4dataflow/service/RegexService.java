package lii.autotextprocessor4dataflow.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexService {

    // Method to check if a string matches a given regex pattern
    public boolean search(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }
}
