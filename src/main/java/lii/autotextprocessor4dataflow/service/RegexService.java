package lii.autotextprocessor4dataflow.service;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexService {

    // Method to check if a string matches a given regex pattern
    public boolean search(String inputString, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.find();
    }

    // Method to replace all occurrences of a regex pattern in a string with a replacement string
    public String replace(String inputString, String regexPattern, String replacementString){
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.replaceAll(replacementString);
        }

    // Method to extract all matches of a regex pattern from a string and return a string array
    public String[] extractAllMatches(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.results()
                .map(MatchResult::group)
                .toArray(String[]::new);
    }


}
