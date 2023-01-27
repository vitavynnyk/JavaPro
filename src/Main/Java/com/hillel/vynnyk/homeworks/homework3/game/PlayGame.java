package com.hillel.vynnyk.homeworks.homework3.game;

import java.util.Scanner;

public class PlayGame {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        int n = (int) Math.floor(Math.random() * words.length);
        System.out.println(words[n]);

        System.out.println("Please enter your word:");
        Scanner scanner = new Scanner(System.in);
        char[] result = words[n].toCharArray();
        char a = '#';

        while (true) {
            String userValue = scanner.nextLine();
            if (userValue.toLowerCase().equals(words[n])) {
                System.out.println("you win!!!");
                break;
            } else {
                try {

                    char[] userValue2 = userValue.toCharArray();
                    for (int i = 0; i <= result.length; i++) {
                        if (userValue2[i] == result[i]) {
                            System.out.print(result[i]);
                        }
                        if (userValue2[i] != result[i]) {
                            result[i] = a;
                            System.out.print(result[i]);
                        }
                    }
                    System.out.println(" try again");

                } catch (ArrayIndexOutOfBoundsException e) {
                    if (userValue.length() <= words[n].length()) {
                        int b = 15 - userValue.length() ;
                        for (int i = 0; i < b; i++) {
                            System.out.print(a);
                        }
                    }
                    if (userValue.length() > words[n].length()) {
                        int b = 15 - words[n].length();
                        for (int i =0; i < b; i++) {
                            System.out.print(a);
                        }
                    }
                    System.out.println(" try again");
                }
            }

        }
    }
}












