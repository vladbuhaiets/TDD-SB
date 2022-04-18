package com.education.TDDSB.CodeWars;

import java.util.regex.Pattern;

public class PigLatin {

    public static String pigIt(String input) {
        String result = "";
        String[] s = input.split(" ");
        for (String str : s) {
            if (Pattern.matches("^[a-zA-Z]+$", str)) {
                str = str.substring(1) + str.charAt(0) + "ay ";
            }
            result += str;

        }
        return result.trim();
    }
}
