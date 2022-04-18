package com.education.TDDSB.CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PigLatinTest {
    @Test
    public void pigItIsSuccess() {
        String expected = "igPay atinlay siay oolcay !)_(:@#";
        String actual = PigLatin.pigIt("Pig latin is cool !)_(:@#");
        assertEquals(expected, actual);
    }

    @Test
    public void pigItResultExpectedDoesNotTrimmed() {
        String expected = "igPay atinlay siay oolcay !)_(:@# ";
        String actual = PigLatin.pigIt("Pig latin is cool !)_(:@#");
        assertNotEquals(expected, actual);
        assertEquals(expected, actual + " ");
    }

    @Test
    public void pigItWithBlankInputReturnBlank() {
        String expected = "";
        String actual = PigLatin.pigIt("");
        assertEquals(expected, actual);
    }

}
