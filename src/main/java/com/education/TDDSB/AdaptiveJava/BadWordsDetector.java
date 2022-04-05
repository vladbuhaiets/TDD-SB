package com.education.TDDSB.AdaptiveJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BadWordsDetector {

    public Stream<String> createBadWordsDetectingStream(String text, List<String> badWords) {
        return Arrays.stream(text.split(" ")).filter(badWords::contains).distinct().sorted();
    }
}
