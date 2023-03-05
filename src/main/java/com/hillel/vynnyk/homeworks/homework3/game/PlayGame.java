package com.hillel.vynnyk.homeworks.homework3.game;

import java.util.Scanner;

import static com.hillel.vynnyk.homeworks.homework3.game.Game.play;

public class PlayGame {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        int n = (int) Math.floor(Math.random() * words.length);
        System.out.println(words[n]);

        Scanner scanner = new Scanner(System.in);
        Game game = new Game(words[n]);

        while (true) {
            String userValue = scanner.nextLine();
            play(userValue);
            if (userValue.toLowerCase().equals(words[n])) {
                System.exit(0);
            }
        }
    }
}












