package com.education.TDDSB.AdaptiveJava;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskSplitIteratorForSqrtTest {
    List<Double> input1 = Stream.of(4, 4, 4, 100, 100, 100).map(Double::valueOf).collect(Collectors.toList());
    List<Double> input2 = Stream.of(1, 4, 8, 16, 99, 100, 110, 121).map(Double::valueOf).collect(Collectors.toList());

    String output1 = "2.0\n" + "2.0\n" + "2.0\n" + "\n" + "10.0\n" + "10.0\n" + "10.0";

    String output2 = "2.0\n" + "2.8284271247461903\n" + "4.0\n" + "\n" + "10.0\n" + "10.488088481701515\n" + "11.0";

    @Test
    public void spliteratorWorkTestWithFirstInputIsSuccess() {
        List<Double> actual = TaskSplitIteratorForSqrt.spliteratorWork(input1);

        List<Double> expected = input1.stream().filter(integer -> integer > 1).map(Math::sqrt).collect(Collectors.toList());

        assertEquals(expected, actual);
    }

    @Test
    public void spliteratorWorkTestWithSecondInputIsSuccess() {
        List<Double> actual = TaskSplitIteratorForSqrt.spliteratorWork(input2);

        List<Double> expected = input2.stream().filter(integer -> integer > 1).map(Math::sqrt).collect(Collectors.toList());

        assertEquals(expected, actual);
    }

    @Test
    public void printWithFirstInputIsSuccess() {
        List<Double> sqrs = TaskSplitIteratorForSqrt.spliteratorWork(input1);

        String actual = TaskSplitIteratorForSqrt.print(sqrs);

        assertEquals(output1, actual);
    }

    @Test
    public void printWithSecondInputIsSuccess() {
        List<Double> sqrs = TaskSplitIteratorForSqrt.spliteratorWork(input2);

        String actual = TaskSplitIteratorForSqrt.print(sqrs);

        assertEquals(output2, actual);
    }

}