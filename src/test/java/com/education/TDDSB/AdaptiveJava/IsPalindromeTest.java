package com.education.TDDSB.AdaptiveJava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

public class IsPalindromeTest {

    private final IsPalindrome classUnderTest = new IsPalindrome();
    @Test
    public void verifyIfPalindromeIsSuccess()
    {
        boolean actual = classUnderTest.verify("kayak");
        assertTrue(actual);
    }

    @Test
    public void verifyIfNotPalindrome()
    {
        boolean actual = classUnderTest.verify("java");
        assertFalse(actual);
    }
}
