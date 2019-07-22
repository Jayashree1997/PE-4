package com.stackroute.pe4;

public class Sort {
    public String alphabeticalOrder(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                    return String.valueOf(temp);
                }
            }

        }
    }
}