package com.hillel.vynnyk.homeworks.homework7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestFileNavigator {

    @Test
    public void shouldAddFile() {
        Map<String, ArrayList<FileData>> map = new HashMap<>();
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C:/windows/", new FileData("hello.txt",2));
        fileNavigator.add("C:/windows/", new FileData("helloWorld.txt",10));
        ArrayList<FileData> file = new ArrayList<>();
        ArrayList<FileData> file2 = new ArrayList<>();
        file.add(new FileData("hello.txt", 2));
        file.add(new FileData("helloWorld.txt", 10));
        file2.add(new FileData("hello.txt", 6));
        map.put("C:/windows/", file);
        map.put("C:/files/", file2);

        Assertions.assertEquals(map, fileNavigator.add("C:/files/",
                new FileData("hello.txt",6)));

    }

    @Test
    public void shouldFindFile() {
        Map<String, ArrayList<FileData>> map = new HashMap<>();
        ArrayList<FileData> file = new ArrayList<>();
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C:/windows/", new FileData("hello.txt",2));
        file.add(new FileData("hello.txt", 2));
        map.put("C:/windows/", file);

        Assertions.assertEquals(file, fileNavigator.find("C:/windows/"));
    }

    @Test
    public void shoulFilterBySizeFiles() {
        ArrayList<FileData> file = new ArrayList<>();
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C:/windows/", new FileData("hello.txt",4));
        fileNavigator.add("C:/windows/", new FileData("helloWorld.txt",10));
        fileNavigator.add("D:/files/", new FileData("helloWorld.txt",14));
        file.add(new FileData("hello.txt", 4));
        file.add(new FileData("helloWorld.txt", 10));
        file.add(new FileData("helloWorld.txt", 14));

        Assertions.assertEquals(file,fileNavigator.filterBySize(20));

    }

    @Test
    public void shouldRemoveFile(){
        Map<String, ArrayList<FileData>> map = new HashMap<>();
        ArrayList<FileData> file = new ArrayList<>();
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C:/windows/", new FileData("hello.txt",4));
        fileNavigator.add("C:/windows/", new FileData("hello2.txt",10));
        fileNavigator.add("C:/files/", new FileData("helloWorld.txt",14));
        file.add(new FileData("helloWorld.txt", 14));
        map.put("C:/files/", file);

        Assertions.assertEquals(map,fileNavigator.remove("C:/windows/"));
    }

    @Test
    public void shouldSortBySize(){
        ArrayList<FileData> file = new ArrayList<>();
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C:/windows/", new FileData("hello2.txt",10));
        fileNavigator.add("C:/windows/", new FileData("hello.txt",4));
        fileNavigator.add("C:/files/", new FileData("helloWorld.txt",14));
        file.add(new FileData("hello.txt", 4));
        file.add(new FileData("hello2.txt", 10));
        file.add(new FileData("helloWorld.txt", 14));

        Assertions.assertEquals(file,fileNavigator.sortBySize());
    }
}
