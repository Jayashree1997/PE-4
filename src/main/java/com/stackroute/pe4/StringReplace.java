package com.stackroute.pe4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplace {
    public String replace(String s) {
        String s1 = s.replaceAll("d", "f");
        String s2 = s1.replaceAll("l", "t");
        return s2;
    }

    public static class StringMatcher {

        private String givenString;


        public boolean setString(String inputString) {
            boolean bool = false;
            if (inputString == null){
                inputString.charAt(0);
            }
            else if (inputString.trim().isEmpty()){
                inputString.charAt(2);
            }
            else{
                this.givenString = inputString;
                bool = true;
            }
            return bool;
        }



        public List<String> getMultipleOccurrence(String pattern){
            if (pattern.trim().isEmpty()){
                throw new RuntimeException();
            }
            List<String> occurrenceIndex = new ArrayList<>();
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher matcher = pattern1.matcher(this.givenString);
            while (matcher.find()){
                occurrenceIndex.add(
                        String.valueOf(matcher.start()).concat("-").concat(String.valueOf(matcher.end())));
            }
            if (occurrenceIndex.size() == 0){
                occurrenceIndex = null;
            }
            return occurrenceIndex;
        }


    }
}
