package com.education.TDDSB.CodeWars;

import java.util.stream.Stream;

public class DigPow {
    public static long digPow(int n, int p) {

        if (n <= 0 || p <= 0)
            throw new IllegalArgumentException("n and p will always be given as strictly positive integers");

        String strValue = String.valueOf(n);

        Integer[] digits = Stream.of(strValue.split("")).map(Integer::parseInt).toArray(Integer[]::new);

        Double leftPart = 0D;

        for (Integer integer : digits) {
            leftPart += Math.pow(integer.doubleValue(), p++);
        }

        Long longLeftPart = leftPart.longValue();

        if (longLeftPart % n == 0)
            return longLeftPart / n;
        return -1;
    }
}
