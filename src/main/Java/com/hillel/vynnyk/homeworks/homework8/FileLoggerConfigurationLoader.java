package com.hillel.vynnyk.homeworks.homework8;

import java.io.IOException;

public class FileLoggerConfigurationLoader {
    public FileLoggerConfiguration load() throws IOException {
       System.getProperties().load(
                FileLoggerConfiguration.class.getResourceAsStream("/config.properties"));

        FileLoggerConfiguration fileLoggerConfiguration =
                new FileLoggerConfiguration(System.getProperty("Path"),
                        System.getProperty("Max-size"), System.getProperty("Level"));
        return fileLoggerConfiguration;
    }

}
