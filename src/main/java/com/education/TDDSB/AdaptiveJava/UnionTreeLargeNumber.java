package com.education.TDDSB.AdaptiveJava;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class UnionTreeLargeNumber {

    private final String input;

    public UnionTreeLargeNumber(String input) {
        this.input = input;
    }

    public String parseAndUnion() {
        String[] sets = input.split(";");

        Set<Integer> set1 = Arrays.stream(sets[0].split(" ")).map(Integer::valueOf).collect(Collectors.toCollection(TreeSet::new));

        Set<Integer> set2 = Arrays.stream(sets[1].split(" ")).map(Integer::valueOf).collect(Collectors.toCollection(TreeSet::new));

        Set<Integer> set3 = Arrays.stream(sets[2].split(" ")).map(Integer::valueOf).collect(Collectors.toCollection(TreeSet::new));


        Set<Integer> resultTreeSet = unionTreeLargeNumber(set1, set2, set3);
        String collect = resultTreeSet.stream().map(String::valueOf).collect(Collectors.joining("\n"));
        System.out.println(collect);
        return collect;
    }

    public static TreeSet<Integer> unionTreeLargeNumber(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        TreeSet<Integer> resultSet = new TreeSet<>();
        resultSet.add(set1.stream().max(Integer::compareTo).get());
        resultSet.add(set2.stream().max(Integer::compareTo).get());
        resultSet.add(set3.stream().max(Integer::compareTo).get());

        return new TreeSet<>(resultSet.descendingSet());
    }
}
