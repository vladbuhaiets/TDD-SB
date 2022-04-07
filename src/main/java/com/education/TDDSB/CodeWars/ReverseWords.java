package com.education.TDDSB.CodeWars;

public class ReverseWords {
    public static String reverseWords(final String original) {

        if (original.strip().equals("")) {
            return original;
        }

        StringBuilder result = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();

        String[] strings = original.split(" ");

        for (String str : strings) {

            stringBuilder.append(str);
            stringBuilder.reverse();
            stringBuilder.append(" ");
            result.append(stringBuilder);

            stringBuilder.setLength(0);
        }

        return result.substring(0, result.lastIndexOf(" "));
    }
}
