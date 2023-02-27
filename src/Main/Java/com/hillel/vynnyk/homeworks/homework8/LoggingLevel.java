package com.hillel.vynnyk.homeworks.homework8;

public enum LoggingLevel {

    INFO ("Info"),
    DEBUG("Debug"),;
    public final String name;

    LoggingLevel(String name) {
        this.name = name;
    }

}

