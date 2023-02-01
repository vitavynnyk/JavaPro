package com.hillel.vynnyk.homeworks.homework3.part1;

public class HomeMethods {
    public static int findSymbolOccurrence(String s, char c) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                counter++;
            }
        }
        return counter;

    }
    public static int findWordPosition(String source, String target) {
        int number = source.indexOf(target.substring(0));
        if (source.contains(target)) {
        }
        return number;
    }

    public static String stringReverse(String string) {
        StringBuilder string1 = new StringBuilder(string);
        return (string1.reverse().toString());
    }

    public static boolean isPalindrome (String string){
        StringBuilder abc = new StringBuilder(string);
        return abc.toString().equals(abc.reverse().toString());
        }
    }

