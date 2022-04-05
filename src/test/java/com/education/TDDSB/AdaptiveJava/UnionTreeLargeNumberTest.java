package com.education.TDDSB.AdaptiveJava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnionTreeLargeNumberTest {

    String input = "6 11 9 18 10;12 13 19 8 16;3 4 5 15 20";
    String output = "20\n" + "19\n" + "18";

    @Test
    public void unionTreeLargeNumbers_Success() {

        UnionTreeLargeNumber classUnderTest = new UnionTreeLargeNumber(input);

        String actual = classUnderTest.parseAndUnion();

        assertEquals(output, actual);

    }
}
