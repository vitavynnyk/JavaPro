package com.hillel.vynnyk.homeworks.homework3;

import com.hillel.vynnyk.homeworks.homework3.game.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGame {
    @Test

    public void shouldReturnTrue() {
        Game game = new Game("olive");
        String guess = "olive";
        assertEquals("olive", Game.play(guess));
    }

}

