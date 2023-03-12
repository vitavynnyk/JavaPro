package com.hillel.vynnyk.homeworks.homework10;

import java.util.Arrays;

public class ArrayInitializer {

    public static void init(double[] array) {
        double[] array1 = Arrays.copyOfRange(array, 0, array.length / 2);
        double[] array2 = Arrays.copyOfRange(array, array.length / 2, array.length);

        Thread thread1 = new Thread(new ArrayInitializerRunner(array1));
        thread1.start();
        Thread thread2 = new Thread(new ArrayInitializerRunner(array2));
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.arraycopy(array1, 0, array, 0, array.length / 2);
        System.arraycopy(array2, 0, array, array.length / 2, array.length / 2);
        System.out.println("New array:" + Arrays.toString(array));
    }

}