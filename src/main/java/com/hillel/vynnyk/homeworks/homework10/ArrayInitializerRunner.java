package com.hillel.vynnyk.homeworks.homework10;

import java.util.Arrays;

public class ArrayInitializerRunner implements Runnable {
    double[] array;

    public ArrayInitializerRunner(double[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        initPartOfArray(array);
    }

    private void initPartOfArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * Math.sin(0.2 + i / 5.0) * Math.cos(0.2 + i / 5.0) * Math.cos(0.4 + i / 2.0);
        }
        System.out.println(Thread.currentThread().getName() + ":"  + Arrays.toString(array));
    }
}
