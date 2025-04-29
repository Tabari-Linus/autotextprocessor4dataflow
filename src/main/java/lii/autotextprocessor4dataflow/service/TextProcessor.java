package lii.autotextprocessor4dataflow.service;

public class TextProcessor {

    private final RegexService regexService;

    public TextProcessor() {
        this.regexService = new RegexService();
    }

    // Method to search for a pattern in text
    public boolean searchPattern(String text, String pattern) {
        return regexService.search(text, pattern);
    }

    // Method to replace text that match the regrex pattern
    public String replacePattern(String text, String pattern, String replacement) {
        return regexService.replace(text, pattern, replacement);
    }

    // Method to return all strings in the text string that matches the regrex pattern
    public String[] extractMatches(String text, String pattern) {
        return regexService.extractAllMatches(text, pattern);
    }
}
