package com.hillel.vynnyk.homeworks.homework12;

import java.util.Arrays;

public class MyListGeneric<T> implements GenericHillelList<T> {
    private T[] array;

    public MyListGeneric(T[] array) {
        this.array = array;
    }

    @Override
    public void add(T item) {
        T[] list2 = Arrays.copyOf(array,array.length + 1);
        list2[array.length] = item;
         array = list2;
    }

    @Override

    public T remove(int index) {
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    T[] result = (T[]) new Object[array.length-1];
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
    public boolean contains(T item) {
        for (T s : array) {
            if (s.equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public  int indexOf(T item) {
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
    public T get(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
            }
        }
        return array[index];
    }

    @Override
    public Object[] getAll() {
        return array;
    }
}
