package com.hillel.vynnyk.homeworks.homework7;

import java.util.Objects;

public class FileData {

    private String name;
    private int size;
    private String path;


    public FileData(String name,int size) {
        this.name = name;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name + size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileData fileData = (FileData) o;
        return size == fileData.size && Objects.equals(name, fileData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
