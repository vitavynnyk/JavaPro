package com.hillel.vynnyk.homeworks.homework6.phonebook;

import java.util.ArrayList;

public class PhoneBook {
    private final ArrayList<Note> books = new ArrayList<>();

    public void add(String name, String phoneNumber) {
        books.add(new Note(name, phoneNumber));
    }


    public Note find(String name) {
        for (Note note : books) {
            if (note.getName().equalsIgnoreCase(name)) {
                System.out.println("You have found note:" + "\n" + note);
                return note;
            }
        }
        return null;
    }

    public ArrayList<Note> findAll(String name) {
        ArrayList<Note> book2 = new ArrayList<>();
        for (Note note : books) {
            if (note.getName().equalsIgnoreCase(name)) {
                book2.add(note);
            }
        } System.out.println(book2);
        return book2;
    }


    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Vita Vynnyk", "0509349580");
        phoneBook.add("Volodymyr Kuzmenko", "0634758987");
        phoneBook.add("Vita Vynnyk", "0668547589");
        phoneBook.add("Vita Vynnyk", "0734567823");
        phoneBook.add("Inna Janvari", "0986745632");
        phoneBook.add("Volodymyr Kuzmenko", "0675436233");

        phoneBook.findAll("Vita Vynnyk");
        phoneBook.findAll("Volodymyr Kuzmenko");





    }

}
