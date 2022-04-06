package com.education.TDDSB.AdaptiveJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;

public class TaskSplitIteratorForSqrt {

    public static List<Double> spliteratorWork(List<Double> lst) {
        List<Double> sqrs = new ArrayList<>();

        Spliterator<Double> spliterator = lst.spliterator();

        while (spliterator.tryAdvance(sqrs::add)) {
        }

        return sqrs.stream().filter(aDouble -> aDouble.intValue() > 1).map(Math::sqrt).collect(Collectors.toList());
    }

    public static String print(List<Double> list) {
        Spliterator<Double> secondHalf = list.spliterator();
        Spliterator<Double> firstHalf = secondHalf.trySplit();
        StringBuilder stringBuilder = new StringBuilder();

        while (firstHalf.tryAdvance(aDouble -> stringBuilder.append(aDouble).append("\n"))) {
        }
        String firstPart = stringBuilder.toString();
        String checkedFirstPart = Arrays.stream(firstPart.split("\n")).filter(s -> Double.parseDouble(s) >= 2).map(s -> s + "\n").collect(Collectors.joining());

        while (secondHalf.tryAdvance(aDouble -> stringBuilder.append(aDouble).append("\n"))) {
        }
        String secondPart = stringBuilder.toString();
        String checkedSecondPart = Arrays.stream(secondPart.split("\n")).filter(s -> Double.parseDouble(s) >= 10).map(s -> s + "\n").collect(Collectors.joining());

        String res = checkedFirstPart + "\n" + checkedSecondPart;

        System.out.println(res);

        return res.substring(0, res.lastIndexOf("\n"));
    }
}
