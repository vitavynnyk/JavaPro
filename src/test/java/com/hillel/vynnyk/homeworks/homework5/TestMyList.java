package com.hillel.vynnyk.homeworks.homework5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMyList {
    @Test
    public void shouldEddItem() {
        MyList array = new MyList(new String[]{"V", "K", "S"});
        array.add("H");
        assertEquals("[V, K, S, H]", Arrays.toString(array.getAll()));
    }
    @Test

    public void shouldRemoveItemInIndex(){
        MyList array = new MyList(new String[]{"V", "K", "S"});
        assertEquals("V", array.remove(0));
    }

    @Test
    public void containsItem(){
        MyList array = new MyList(new String[]{"V", "K", "S"});
        assertTrue(array.contains("V"));
    }

    @Test
    public void shouldReturnIndexOfItem(){
        MyList array = new MyList(new String[]{"V", "K", "S"});
        assertEquals(1,array.indexOf("K"));
    }

    @Test
    public void shouldReturnSize(){
        MyList array = new MyList(new String[]{"V", "K", "S"});
        assertEquals(3,array.size());
    }

    @Test
    public void shouldGetIndex(){
        MyList array = new MyList(new String[]{"V", "K", "S"});
        assertEquals("V", array.get(0));
    }

    @Test
    public void shouldGetAll(){
        MyList array = new MyList(new String[]{"V", "K", "S"});
        assertEquals("[V, K, S]",Arrays.toString(array.getAll()));
    }
}