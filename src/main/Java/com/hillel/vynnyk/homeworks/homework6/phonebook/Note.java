package com.hillel.vynnyk.homeworks.homework6.phonebook;

import java.util.Objects;

public class Note {
    private final String name;
    private final String phoneNumber1;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(name, note.name) && Objects.equals(phoneNumber1, note.phoneNumber1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber1);
    }

    public Note(String name, String phoneNumber1) {
        this.name = name;
        this.phoneNumber1 = phoneNumber1;
    }

    @Override
    public String toString() {
        return "name: " + name + ", phoneNumber1: " + phoneNumber1;

    }
    public String getName() {
        return name;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }
}
