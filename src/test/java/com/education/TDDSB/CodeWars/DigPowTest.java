package com.education.TDDSB.CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DigPowTest {

    @Test
    public void digPowIsSuccess() {
        int n = 89;
        int p = 1;
        int n1 = 695;
        int p1 = 2;
        int n2 = 46288;
        int p2 = 3;

        long expected = 1;
        long expected1 = 2;
        long expected2 = 51;

        long actual = DigPow.digPow(n, p);
        long actual1 = DigPow.digPow(n1, p1);
        long actual2 = DigPow.digPow(n2, p2);

        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
        assertEquals(expected2, actual2);
    }

    @Test
    public void digPowReturnNegativeInt() {
        int n = 92;
        int p = 1;

        long expected = -1;

        long actual = DigPow.digPow(n, p);

        assertEquals(expected, actual);
    }

    @Test
    public void digRowReturnException() {
        String message = "n and p will always be given as strictly positive integers";
        int n = 1;
        int p = 0;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> DigPow.digPow(n, p));

        assertEquals(message, exception.getMessage());
    }

}
