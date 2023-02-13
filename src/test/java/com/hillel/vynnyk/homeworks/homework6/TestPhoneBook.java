package com.hillel.vynnyk.homeworks.homework6;

import com.hillel.vynnyk.homeworks.homework6.phonebook.Note;
import com.hillel.vynnyk.homeworks.homework6.phonebook.PhoneBook;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPhoneBook {
    @Test

    public void shouldFind() {
        Note note1 = new Note("Vita Vynnyk", "0509349580");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Vita Vynnyk", "0509349580");
        assertEquals(note1, phoneBook.find("Vita Vynnyk"));

    }

    @Test

    public void shouldFindAll() {
        PhoneBook phoneBook = new PhoneBook();
        ArrayList<Note> list = new ArrayList<>();
        Note note1 = new Note("Vita Vynnyk", "0509349580");
        Note note2 = new Note("Vita Vynnyk", "0987654332");
        list.add(note1);
        list.add(note2);
        phoneBook.add("Vita Vynnyk", "0509349580");
        phoneBook.add("Vita Vynnyk", "0987654332");

        assertEquals(list, phoneBook.findAll("Vita Vynnyk"));

    }


}
