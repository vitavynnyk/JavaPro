package com.hillel.vynnyk.homeworks.homework6;

import java.util.*;

public class ArrayListMethods {

    public static int countOccurance(List<String> list, String value) {
        int count = 0;
        for (String item : list) {
            if (item.equals(value)) {
                count++;
            }
        }
        return count;
    }

    public static List<String> toList(String[] itemes) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, itemes);
        return list;
    }

    public static List<Integer> findUnique(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer integer : list) {
            if (!newList.contains(integer)) {
                newList.add(integer);
            }
        }
        return newList;
    }

    public static List<String> calcOccurrence(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        int count = 0;
        for (String item : list) {
            count = Collections.frequency(list, item);
            if (!newList.contains(item)) {
                newList.add(item);
            }
        }
        return newList;
    }

    public static LinkedHashSet<Item> findOccurrence(ArrayList<String> list) {
        ArrayList<Item> newList = new ArrayList<>();
        int count = 0;
        for (String item : list) {
            count = Collections.frequency(list, item);
            newList.add(new Item(item, count));}
        LinkedHashSet<Item> set = new LinkedHashSet<>(newList);
        for (Object o : set) {
            System.out.println(o);
        }
        return set;
    }

}