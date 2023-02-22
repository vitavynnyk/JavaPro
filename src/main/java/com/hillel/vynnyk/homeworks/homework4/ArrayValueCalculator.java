package com.hillel.vynnyk.homeworks.homework4;

import com.hillel.vynnyk.homeworks.homework4.myExceptions.ArrayDataException;
import com.hillel.vynnyk.homeworks.homework4.myExceptions.ArraySizeException;

public class ArrayValueCalculator {

    public static int doCalc(String[][] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 || array[i].length != 4) throw new ArraySizeException("Array must be 4X4");
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Wrong data is in:" + i + j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try {
            int array = doCalc(new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}});
            System.out.println(array);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            int array = doCalc(new String[][]{{"1", "a", "2", "3"}, {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}, {"1", "2", "3", "4"}});
            System.out.println(array);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            int array = doCalc(new String[][]{{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                    {"1", "2", "3", "4"}, {"1", "2", "3", "5"}});
            System.out.println(array);
        } catch (ArraySizeException | ArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }



}



