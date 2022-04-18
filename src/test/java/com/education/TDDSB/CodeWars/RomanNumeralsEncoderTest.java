package com.education.TDDSB.CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RomanNumeralsEncoderTest {

    @Test
    public void encodeToRomanNumeralsIsSuccess() {
        String expected = "VI";
        RomanNumeralsEncoder encoder = new RomanNumeralsEncoder();
        String actual = encoder.solution(6);
        assertEquals(expected, actual);
    }

    @Test
    public void encodeToRomanNumeralsWithInputLike4() {
        String expected = "IV";
        RomanNumeralsEncoder encoder = new RomanNumeralsEncoder();
        String actual = encoder.solution(4);
        assertEquals(expected, actual);
    }

    @Test
    public void encodeToRomanNumeralsWithInputLike778() {
        String expected = "DCCLXXVIII";
        RomanNumeralsEncoder encoder = new RomanNumeralsEncoder();
        String actual = encoder.solution(778);
        assertEquals(expected, actual);
    }

    @Test
    public void encodeToRomanNumeralsWithInputLike1948() {
        String expected = "MCMXLVIII";
        RomanNumeralsEncoder encoder = new RomanNumeralsEncoder();
        String actual = encoder.solution(1948);
        assertEquals(expected, actual);
    }

    @Test
    public void encodeToRomanNumeralsIsFailed() {
        String expected = "IIII";
        RomanNumeralsEncoder encoder = new RomanNumeralsEncoder();
        String actual = encoder.solution(4);
        assertNotEquals(expected, actual);
    }

}
