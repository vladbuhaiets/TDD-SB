package com.education.TDDSB.CodeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LikerTest {

    @Test
    public void onePersonLike() {
        String name = "Vlad";
        String expected = name + " likes this";

        String actual = Liker.whoLikesIt(name);

        assertEquals(expected, actual);
    }

    @Test
    public void nonePersonLike() {
        String expected = "no one likes this";

        String actual = Liker.whoLikesIt();

        assertEquals(expected, actual);
    }

    @Test
    public void twoPersonsLike() {
        String expected = "Jacob and Alex like this";

        String[] names = {"Jacob", "Alex"};

        String actual = Liker.whoLikesIt(names);

        assertEquals(expected, actual);
    }

    @Test
    public void threePersonsLike() {
        String expected = "Max, John and Mark like this";

        String[] names = {"Max", "John", "Mark"};

        String actual = Liker.whoLikesIt(names);

        assertEquals(expected, actual);
    }

    @Test
    public void fourAndMorePersonsLike() {
        String expected = "Alex, Jacob and 2 others like this";

        String[] names = {"Alex", "Jacob", "Mark", "Max"};

        String actual = Liker.whoLikesIt(names);

        assertEquals(expected, actual);
    }

}
