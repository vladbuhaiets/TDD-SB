package com.education.TDDSB.AdaptiveJava;

import org.springframework.util.StringUtils;

public class IsPalindrome {


    public boolean verify(String input) {
        StringBuilder strBuilder = new StringBuilder(input);
        String reverse = strBuilder.reverse().toString();
        return input.equals(reverse);
    }
}
