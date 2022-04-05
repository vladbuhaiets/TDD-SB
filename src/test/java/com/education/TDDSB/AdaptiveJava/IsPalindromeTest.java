package com.education.TDDSB.AdaptiveJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsPalindromeTest {

    private final IsPalindrome classUnderTest = new IsPalindrome();

    @Test
    public void verifyIfPalindromeIsSuccess() {
        boolean actual = classUnderTest.verify("kayak");
        assertTrue(actual);
    }

    @Test
    public void verifyIfNotPalindrome() {
        boolean actual = classUnderTest.verify("java");
        assertFalse(actual);
    }
}
