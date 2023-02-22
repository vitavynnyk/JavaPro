package com.hillel.vynnyk.homeworks.homework7;

import java.util.*;


public class FileNavigator {
    Map<String,List<FileData>> map = new HashMap<>();

    public Map<String, List<FileData>> add(String path, FileData file) {
        List<FileData> data = new ArrayList<>();
        if (map.containsKey(path)) {
            map.get(path).add(file);
        } else {
            data.add(file);
            map.put(path, data);
        }
        System.out.println(map);
        return map;
    }

    public List<FileData> find(String key) {
            return map.get(key);

    }

    public List<FileData> filterBySize(int size) {
        List<FileData> data = new ArrayList<>();
        for (List<FileData> fileData : map.values()) {
            for (FileData file : fileData) {
                if (file.getSize() <= size) {
                    data.add(file);
                }
            }
        }
        return data;
    }

    public  boolean remove(String key) {
        map.remove(key);
        return true;
    }

    public ArrayList<FileData> sortBySize() {
        ArrayList<FileData> data = new ArrayList<>();
        SizeComporator mySizeComporator = new SizeComporator();
        for (List<FileData> fileData : map.values()) {
            data.addAll(fileData);
        }
        data.sort(mySizeComporator);
        return data;
    }



    public static void main(String[] args) {
        FileNavigator example1 = new FileNavigator();


        example1.add("C:/windows/", new FileData("hello.txt", 2));
        example1.add("C:/files/", new FileData("hello2.txt", 5));
        example1.add("C:/windows/", new FileData("hello.txt", 2));
//        example1.add("C:/windows/", new FileData("hello5.txt", 8));
//        example1.add("D:/files/", new FileData("helloWorld.txt", 10));
//
//        example1.add("D:/files/", new FileData("hello.txt", 5));
////        example1.add("helloWorld.txt", 14);
//        example1.add("Moon.txt", 10);
        System.out.println();

//

//        example1.find("C:/windows/helloWorld.txt");
//        example1.find("C:/windows/hello.txt");
//        example1.find("C:/windows/helloMom.txt");
////        example1.remove("C:/windows/hello.txt");
//        System.out.println();
//
//        example1.filterBySize(10);
//        System.out.println();
//
//        example1.sortBySize();


    }

}

