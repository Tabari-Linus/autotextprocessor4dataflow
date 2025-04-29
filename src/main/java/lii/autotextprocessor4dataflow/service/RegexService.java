package lii.autotextprocessor4dataflow.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexService {

    // Method to check if a string matches a given regex pattern
    public boolean search(String inputString, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.find();
    }

    public String replace(String inputString, String regexPattern, String replacementString){
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.replaceAll(replacementString);
        }


}
