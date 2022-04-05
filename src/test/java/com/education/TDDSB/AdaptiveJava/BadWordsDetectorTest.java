package com.education.TDDSB.AdaptiveJava;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BadWordsDetectorTest {
    private final BadWordsDetector detector = new BadWordsDetector();

    @Test
    void detectBadWordsIsSuccess() {
        String text = "Some text to verify if text have fuck or shit in whole article) fuck shit fuck";
        Stream<String> expectedStream = Stream.of("fuck", "shit");
        Stream<String> actualBadWords = detector.createBadWordsDetectingStream(text, List.of("fuck", "shit", "damn", "hoe"));
        List<String> expected = expectedStream.collect(Collectors.toList());
        List<String> actual = actualBadWords.collect(Collectors.toList());
        assertEquals(expected, actual);
    }
}
