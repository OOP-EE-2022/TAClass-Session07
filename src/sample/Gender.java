package sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Gender {
    MALE("(?i)male"),
    FEMALE("(?i)female");

    private Pattern commandPattern;

    Gender(String pattern) {
        this.commandPattern = Pattern.compile(pattern);
    }

    public boolean isMatch(String input) {
        Matcher matcher = this.commandPattern.matcher(input);
        return matcher.matches();
    }
}
