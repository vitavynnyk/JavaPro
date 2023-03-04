package com.hillel.vynnyk.homeworks.homework5;

import java.util.Arrays;

public class MyList implements HillelList {
    private String[] array;

    public MyList() {
        array = new String[0];
    }

    public MyList(String[] array) {
        this.array = array;
    }


    @Override
    public void add(String item) {
        String[] list2 = Arrays.copyOf(array, array.length + 1);
        list2[array.length] = item;
        array = list2;
    }


    @Override
    public String remove(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                String[] result = new String[array.length - 1];
                System.arraycopy(array, 0, result, 0, index);

                System.arraycopy(array, index + 1, result, index,
                        array.length - index - 1);
                result = array;
                return array[i];
            }
        }
        return array[index];

    }

    @Override
    public boolean contains(String item) {
        for (String s : array) {
            if (s.equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public String get(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
            }
        }
        return array[index];
    }

    @Override
    public String[] getAll() {
        return array;
    }
}
