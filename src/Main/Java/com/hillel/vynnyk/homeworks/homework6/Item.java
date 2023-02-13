package com.hillel.vynnyk.homeworks.homework6;

import java.util.Objects;

public class Item {
    private final String name;
    private final int occurrence;


    public String getName() {
        return name;
    }

    public int getOccurrence() {
        return occurrence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return occurrence == item.occurrence && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, occurrence);
    }

    public Item(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "{name:" + '"' + name + '"' + ", occurrence:" + occurrence + '}';
    }
}
