package com.hillel.vynnyk.homeworks.homework3;

import com.hillel.vynnyk.homeworks.homework3.part1.HomeMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHomeMethod {
    @Test
    public void test1() {
        String string = " Hello my friend";
        char char1 = 'l';
        Assertions.assertEquals(2, HomeMethods.findSymbolOccurrence(string, char1));
    }

    @Test
    public void test2() {
        String string1 = "Apollo";
        String string2 = "pollo";
        Assertions.assertEquals(1, HomeMethods.findWordPosition(string1, string2));

    }

    @Test
    public void test3() {
        String string1 = "Apollo";
        String string2 = "advice";
        Assertions.assertEquals(-1, HomeMethods.findWordPosition(string1, string2));

    }

    @Test
    public void test4() {
        StringBuilder s = new StringBuilder("123");
        Assertions.assertEquals("321", HomeMethods.stringReverse(s.toString()));
    }

    @Test
    public void test5() {
        String string1 = "mem";
        Assertions.assertTrue(HomeMethods.isPalindrome(string1));
    }

    @Test
    public void test6() {
        String string1 = "mema";
        Assertions.assertFalse(HomeMethods.isPalindrome(string1));
    }
}
