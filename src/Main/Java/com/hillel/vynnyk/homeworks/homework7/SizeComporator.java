package com.hillel.vynnyk.homeworks.homework7;

import java.util.Comparator;

public class SizeComporator implements Comparator<FileData> {

    @Override
    public int compare(FileData file1, FileData file2) {
        if(file1.getSize()==file2.getSize()){
        return 0;}
        if(file1.getSize()>file2.getSize()){
            return 1;}
        else {return -1;}
    }
}
