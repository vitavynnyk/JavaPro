package com.hillel.vynnyk.homeworks.homework4;

import com.hillel.vynnyk.homeworks.homework4.myExceptions.ArrayDataException;
import com.hillel.vynnyk.homeworks.homework4.myExceptions.ArraySizeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArrayValueCalculator {
    @Test
    public void shouldFindValue() {
        String[][] string = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        Assertions.assertEquals(40, ArrayValueCalculator.doCalc(string));
    }

    @Test
    public void shouldThrowArraySizeException() {
        String[][] string = new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};
        Assertions.assertThrows(ArraySizeException.class,
                () -> ArrayValueCalculator.doCalc(string));
    }

    @Test
    public void shouldThrowArrayDataException() {
        String[][] string = new String[][]{{"1", "2", "s", "4"}, {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        Assertions.assertThrows(ArrayDataException.class,
                () -> ArrayValueCalculator.doCalc(string));
    }

}
