package com.hillel.vynnyk.homeworks;

import com.hillel.vynnyk.homeworks.homework12.MyListGeneric;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyListGenericTest {

    @Test
    public void shouldEddItem() {
        MyListGeneric array = new MyListGeneric(new String[]{"V", "K", "S", "H"});
        assertEquals("[V, K, S, H]" , Arrays.toString(array.getAll()));
    }
    @Test

    public void shouldRemoveItemInIndex(){
        MyListGeneric array = new MyListGeneric(new String[]{"V", "K", "S", "H"});
        assertEquals("V", array.remove(0));
    }

    @Test
    public void containsItem(){
        MyListGeneric array = new MyListGeneric(new String[]{"V", "K", "S", "H"});
        assertTrue(array.contains("V"));
    }

    @Test
    public void shouldReturnIndexOfItem(){
        MyListGeneric array = new MyListGeneric(new String[]{"V", "K", "S", "H"});
        assertEquals(1,array.indexOf("K"));
    }

    @Test
    public void shouldReturnSize(){
        MyListGeneric array = new MyListGeneric(new String[]{"V", "K", "S", "H"});
        assertEquals(4,array.size());
    }

    @Test
    public void shouldGetIndex(){
        MyListGeneric array = new MyListGeneric(new String[]{"V", "K", "S", "H"});
        assertEquals("V", array.get(0));
    }

    @Test
    public void shouldGetAll(){
        MyListGeneric array = new MyListGeneric(new String[]{"V", "K", "S", "H"});
        assertEquals("[V, K, S, H]",Arrays.toString(array.getAll()));
    }


}
