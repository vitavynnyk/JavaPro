package com.hillel.vynnyk.homeworks.homework8;

import java.io.File;

public class FileLoggerConfiguration {
    private File file =  new File("src/main/resources/example.properties");
    private LoggingLevel level;
    private  int maxSize  ;

    public FileLoggerConfiguration(LoggingLevel level, int maxSize) {

        this.level = level;
        this.maxSize = maxSize;
    }

    public File getFile() {
        return file;
    }

    public  LoggingLevel getLevel() {
        return level;
    }

    public int getMaxSize() {
        return maxSize;
    }
}
