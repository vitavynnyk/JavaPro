package com.hillel.vynnyk.homeworks.homework8;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class ArrayInitializer {

    public static void init(double[] array) {
        double[] array1 = Arrays.copyOfRange(array, 0, array.length / 2);
        double[] array2 = Arrays.copyOfRange(array, array.length / 2, array.length);

        Thread thread1 = new Thread(new ArrayInitializerRunner(array1));
        thread1.start();
        newValue(array1);
        Thread thread2 = new Thread(new ArrayInitializerRunner(array2));
        thread2.start();
        newValue(array2);
        array = DoubleStream.concat(DoubleStream.of(array1), DoubleStream.of(array2))
                .toArray();
        System.out.println("New array:" + Arrays.toString(array));
    }
    private static void newValue(double[] arrayOld) {
        for (int i = 0; i < arrayOld.length; i++) {
            arrayOld[i] = arrayOld[i] * Math.sin(0.2 + i / 5.0) * Math.cos(0.2 + i / 5.0) * Math.cos(0.4 + i / 2.0);
        }
    }


}