package com.hillel.vynnyk.homeworks.homework3.game;

public class Game {
  static String word;

    public Game(String word) {
       Game.word = word;
    }

    public static String play(String guess) {
            char a = '#';
            if (guess.toLowerCase().equals(word)) {
                System.out.println("You win!!!");
            } else {
                try {
                    for (int i = 0; i <= guess.length(); i++) {
                        if (word.charAt(i) == guess.charAt(i)) {
                            System.out.print(guess.charAt(i));
                        } else {
                            System.out.print(a);
                        }
                    }
                    System.out.println(" try again");
                } catch (StringIndexOutOfBoundsException e) {
                    if (word.length() <= guess.length()) {
                        int b = 15 - word.length();
                        for (int i = 0; i < b; i++) {
                            System.out.print(a);
                        }
                    }
                    if (word.length() > guess.length()) {
                        int b = 15 - guess.length();
                        for (int i = 0; i < b; i++) {
                            System.out.print(a);
                        }
                    }
                    System.out.println(" try again");
                }
            }
            return word;
        }
    }


