package com.hillel.vynnyk.homeworks.homework3;

import org.junit.jupiter.api.Test;

import static com.hillel.vynnyk.homeworks.homework3.part1.HomeMethods.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestHomeMethod {
    @Test
    public void shouldFindSymbolOccurrence() {
        String string = " Hello my friend";
        char char1 = 'l';
        assertEquals(2, findSymbolOccurrence(string, char1));
    }

    @Test
    public void shouldFindWordPosition() {
        String string1 = "Apollo";
        String string2 = "pollo";
        assertEquals(1, findWordPosition(string1, string2));

    }

    @Test
    public void shouldFindWordPosition2() {
        String string1 = "Apollo";
        String string2 = "advice";
        assertEquals(-1, findWordPosition(string1, string2));

    }

    @Test
    public void shouldStringReverse() {
        String input = "123";
        assertEquals("321", stringReverse(input));
    }

    @Test
    public void shouldApprovePalindrome() {
        String string1 = "mem";
        assertTrue(isPalindrome(string1));
    }

    @Test
    public void shouldApprovePalindrome2() {
        String string1 = "mema";
       assertFalse(isPalindrome(string1));
    }
}
