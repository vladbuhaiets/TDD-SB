package com.education.TDDSB.CodeWars;

public class RomanNumeralsEncoder {

    public String solution(int n) {

        String result = "";

        while (n != 0) {
            if (n / 1000 >= 1) {
                n -= 1000;
                result += "M";
            } else if (n / 900 >= 1) {
                n -= 900;
                result += "CM";
            } else if (n / 500 >= 1) {
                n -= 500;
                result += "D";
            } else if (n / 400 >= 1) {
                n -= 400;
                result += "CD";
            } else if (n / 100 >= 1) {
                n -= 100;
                result += "C";
            } else if (n / 90 >= 1) {
                n -= 90;
                result += "XC";
            } else if (n / 50 >= 1) {
                n -= 50;
                result += "L";
            } else if (n / 40 >= 1) {
                n -= 40;
                result += "XL";
            } else if (n / 10 >= 1) {
                n -= 10;
                result += "X";
            } else if (n / 9 >= 1) {
                n -= 9;
                result += "IX";
            } else if (n / 5 >= 1) {
                n -= 5;
                result += "V";
            } else if (n / 4 >= 1) {
                n -= 4;
                result += "IV";
            } else if (n >= 1) {
                n -= 1;
                result += "I";
            }

        }

        return result;
    }

}
