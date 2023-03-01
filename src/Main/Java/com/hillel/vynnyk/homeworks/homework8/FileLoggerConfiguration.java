package com.hillel.vynnyk.homeworks.homework8;

public class FileLoggerConfiguration {
    private String path;
    private String maxSize;
    private String  level;

    public FileLoggerConfiguration(String path, String maxSize, String level) {
        this.path = path;
        this.maxSize = maxSize;
        this.level = level;
    }

    public String getPath() {
        return path;
    }

    public String getMaxSize() {
        return maxSize;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public java.lang.String toString() {
        return "FileLoggerConfiguration{" +
                "path='" + path + '\'' +
                ", maxSize='" + maxSize + '\'' +
                ", level=" + level +
                '}';
    }
}
