package com.hillel.vynnyk.homeworks.homework10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayInitializerTest {

    @Test

    public void shouldInitArray() {
        double[] array = new double[12];
        Arrays.fill(array, 5);
        ArrayInitializer.init(array);
        assertNotEquals(5, array[0], 0.0001);
        for (int i = 0; i < array.length / 2; i++) {
            assertEquals(array[i], array[array.length / 2 + i]);
        }
        
    }
}
