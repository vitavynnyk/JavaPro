package com.hillel.vynnyk.homeworks.homework8;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileLoggerConfigurationTest {
    @Test
    public void shouldLoadConfiguration() throws IOException {
        FileLoggerConfigurationLoader loader1 = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration config = loader1.load();

        assertEquals("logs", config.getPath());
        assertEquals(LoggingLevel.INFO.name, config.getLevel());
        assertEquals(500, Integer.parseInt(config.getMaxSize()));
    }
}
