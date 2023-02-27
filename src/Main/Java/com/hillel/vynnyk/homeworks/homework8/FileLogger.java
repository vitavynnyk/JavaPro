package com.hillel.vynnyk.homeworks.homework8;

import java.io.*;
import java.util.Properties;

public class FileLogger {
    FileLoggerConfiguration configuration = new FileLoggerConfiguration(LoggingLevel.DEBUG, 32);
    Properties properties = new Properties();

    public void debug(String message) {

        try (InputStream in = new FileInputStream(configuration.getFile())) {
            if (in == null) {
                throw new FileNotFoundException();
            }
            if (configuration.getLevel().equals(LoggingLevel.DEBUG)) {
                properties.setProperty("Path", configuration.getFile().getPath());
                properties.setProperty("Level", configuration.getLevel().name);
                properties.setProperty("Max-size", String.valueOf(configuration.getMaxSize()));

                OutputStream out = new FileOutputStream(configuration.getFile(), true);
                properties.store(out, "Message: " + message);
            } else {
                properties.setProperty("Path", configuration.getFile().getPath());
                properties.setProperty("Level", configuration.getLevel().name);
                properties.setProperty("Max-size", String.valueOf(configuration.getMaxSize()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void info(String message) {
        try (InputStream in = new FileInputStream(configuration.getFile())) {
            if (in == null) {
                throw new FileNotFoundException();
            }
            if (configuration.getLevel().equals(LoggingLevel.DEBUG)) {
                properties.setProperty("Path", configuration.getFile().getPath());
                properties.setProperty("Level", configuration.getLevel().name);
                properties.setProperty("Max-size", String.valueOf(configuration.getMaxSize()));

                OutputStream out = new FileOutputStream(configuration.getFile(), true);
                properties.store(out, "Message: " + message);
            } else {
                properties.setProperty("Path", configuration.getFile().getPath());
                properties.setProperty("Level", configuration.getLevel().name);
                properties.setProperty("Max-size", String.valueOf(configuration.getMaxSize()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger();
        fileLogger.debug("Message");
        fileLogger.info("Here is info message");
        fileLogger.info("Here is   new info message");
    }

}
