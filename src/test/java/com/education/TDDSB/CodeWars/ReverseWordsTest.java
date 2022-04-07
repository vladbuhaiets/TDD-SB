package com.education.TDDSB.CodeWars;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsTest {

    @Test
    public void stringIsReversed() {

        String input1 = "This is an example!";
        String input2 = "double  spaces";
        String expected1 = "sihT si na !elpmaxe";
        String expected2 = "elbuod  secaps";

        String actual1 = ReverseWords.reverseWords(input1);
        String actual2 = ReverseWords.reverseWords(input2);

        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void spacesAreRetained() {
        String input1 = "This is an example!";
        String input2 = "double  spaces";
        String expected1 = "sihT si na !elpmaxe";
        String expected2 = "elbuod  secaps";

        long spacesCount1 = Stream.of(input1.split("")).filter(s -> s.equals(" ")).count();
        long spacesCount2 = Stream.of(input2.split("")).filter(s -> s.equals(" ")).count();

        String actual1 = ReverseWords.reverseWords(input1);
        String actual2 = ReverseWords.reverseWords(input2);

        long actualSpaces1 = Stream.of(actual1.split("")).filter(s -> s.equals(" ")).count();
        long actualSpaces2 = Stream.of(actual2.split("")).filter(s -> s.equals(" ")).count();

        assertEquals(spacesCount1, actualSpaces1);
        assertEquals(spacesCount2, actualSpaces2);
    }

    @Test
    public void spacesAreRetainedWithEmptyAndOneSpaceInputs() {
        String input1 = "";
        String input2 = " ";
        String expected1 = "";
        String expected2 = " ";

        long spacesCount1 = Stream.of(input1.split("")).filter(s -> s.equals(" ")).count();
        long spacesCount2 = Stream.of(input2.split("")).filter(s -> s.equals(" ")).count();

        String actual1 = ReverseWords.reverseWords(input1);
        String actual2 = ReverseWords.reverseWords(input2);

        long actualSpaces1 = Stream.of(actual1.split("")).filter(s -> s.equals(" ")).count();
        long actualSpaces2 = Stream.of(actual2.split("")).filter(s -> s.equals(" ")).count();

        assertEquals(spacesCount1, actualSpaces1);
        assertEquals(spacesCount2, actualSpaces2);
    }

    @Test
    public void spacesAreRetainedWithAllSpacesInput() {

        String input1 = "              ";
        String expected1 = "              ";

        long spacesCount1 = Stream.of(input1.split("")).filter(s -> s.equals(" ")).count();

        String actual1 = ReverseWords.reverseWords(input1);

        long actualSpaces1 = Stream.of(actual1.split("")).filter(s -> s.equals(" ")).count();

        assertEquals(spacesCount1, actualSpaces1);
    }

}
