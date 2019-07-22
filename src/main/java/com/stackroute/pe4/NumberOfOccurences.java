package com.stackroute.pe4;

public class NumberOfOccurences {
    public int countCharacters(String s) {
        int strlength = s.length();
        int strlengthWithoutCharacter = s.replace("a", "").length();
        int charCount = s.length() - s.replaceAll("a", "").length();
        return charCount;
    }

}
