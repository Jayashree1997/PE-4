package com.stackroute.pe4;

public class StringReplace {
    public String replace(String s) {
        String s1 = s.replaceAll("d", "f");
        String s2 = s1.replaceAll("l", "t");
        return s2;
    }
}
