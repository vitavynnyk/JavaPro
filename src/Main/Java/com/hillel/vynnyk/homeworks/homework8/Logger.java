package com.hillel.vynnyk.homeworks.homework8;

import java.io.IOException;

public interface Logger {

    void debug(String message) throws IOException;
    void info(String message) throws IOException;
}
