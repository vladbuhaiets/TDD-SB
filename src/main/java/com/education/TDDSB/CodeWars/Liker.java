package com.education.TDDSB.CodeWars;

public class Liker {
    public static String whoLikesIt(String... names) {

        switch (names.length) {
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            case 4:
                return names[0] + ", " + names[1] + " and 2 others like this";
            default:
                return "no one likes this";
        }


    }
}
