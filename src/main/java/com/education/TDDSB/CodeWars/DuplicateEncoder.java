package com.education.TDDSB.CodeWars;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateEncoder {
    public static String encode(String word) {
        Map<String, Integer> map = new HashMap<>();

        Stream.of(word.split("")).forEach(s -> map.merge(s.toLowerCase(Locale.ROOT), 1, Integer::sum));

        return Stream.of(word.split("")).map(s -> {
            if (map.get(s.toLowerCase(Locale.ROOT)).equals(1))
                return "(";
            return ")";
        }).collect(Collectors.joining());
    }
}
