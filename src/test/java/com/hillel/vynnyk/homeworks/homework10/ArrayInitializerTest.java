package com.hillel.vynnyk.homeworks.homework10;

import com.hillel.vynnyk.homeworks.homework8.ArrayInitializer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayInitializerTest {

    @Test

    public void shouldInitArray() {
        double[] array = new double[12];
        Arrays.fill(array,5);
        ArrayInitializer.init(array);

       for (int i = 0; i < array.length / 2; i++) {
            assertEquals(array[i], array[array.length / 2 + i]);
        };
    }
}
