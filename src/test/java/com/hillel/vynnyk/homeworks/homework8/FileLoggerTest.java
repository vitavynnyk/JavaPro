package com.hillel.vynnyk.homeworks.homework8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLoggerTest {

    @Test
    public void shouldCreateFileName() throws IOException {
        FileLoggerConfigurationLoader loader1 = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration config = loader1.load();
        FileLogger fileLogger = new FileLogger(config);
        String name = "file" + LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
        Assertions.assertEquals(name,fileLogger.createFileName());
    }

}
