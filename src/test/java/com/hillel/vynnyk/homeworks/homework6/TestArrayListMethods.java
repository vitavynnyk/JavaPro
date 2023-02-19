package com.hillel.vynnyk.homeworks.homework6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

import static com.hillel.vynnyk.homeworks.homework6.ArrayListMethods.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrayListMethods {
    @Test
    public void shouldCountOccurrence() {
        List<String> list = new ArrayList<>();
        list.add("value1");
        list.add("value2");
        list.add("valu3");
        list.add("value1");
        assertEquals(2,
                ArrayListMethods.countOccurance(list, "value1"));
    }

    @Test
    public void shouldConvertArrayToList() {
        String[] array = new String[]{"D", "F", "S"};
        assertEquals(Arrays.asList(array), ArrayListMethods.toList(array));
    }

    @Test

    public void shouldFindUnique() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(2);
        list2.add(3);
        list2.add(5);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(5);
        assertEquals(list2, findUnique(list));
    }

    @Test
    public void shouldCalcOccurance(){
        ArrayList <String> list = new ArrayList<>();
        list.add("N");
        list.add("A");
        assertEquals(list,calcOccurrence(list));
    }

    @Test
    public void shouldFindOccurrence(){
        ArrayList <String> list = new ArrayList<>();
        LinkedHashSet<Item> items = new LinkedHashSet<>();
        items.add(new Item("A",2));;
        items.add(new Item("B",1));
        list.add("A");
        list.add("A");
        list.add("B");
        assertEquals(items,findOccurrence(list));
    }
}


