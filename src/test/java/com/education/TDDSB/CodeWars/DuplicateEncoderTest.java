package com.education.TDDSB.CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateEncoderTest {

    @Test
    public void encodeIsSuccessTest() {
        String input = "Prespecialized";
        String input1 = "   ()(   ";
        String expected = ")()())()(()()(";
        String expected1 = "))))())))";

        String actual = DuplicateEncoder.encode(input);
        String actual1 = DuplicateEncoder.encode(input1);

        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
    }

    @Test
    public void encodeWithAllSpacesString() {
        String input = "        ";
        String expected = "))))))))";

        String actual = DuplicateEncoder.encode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void encodeWithEmptyString() {
        String input = "";
        String expected = "(";

        String actual = DuplicateEncoder.encode(input);

        assertEquals(expected, actual);
    }

    @Test
    public void encodeeExampleInputs() {
        String input = "din";
        String input1 = "recede";
        String input2 = "Success";
        String input3 = "(( @";

        String expected = "(((";
        String expected1 = "()()()";
        String expected2 = ")())())";
        String expected3 = "))((";

        String actual = DuplicateEncoder.encode(input);
        String actual1 = DuplicateEncoder.encode(input1);
        String actual2 = DuplicateEncoder.encode(input2);
        String actual3 = DuplicateEncoder.encode(input3);

        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
        assertEquals(expected3, actual3);
    }
}
