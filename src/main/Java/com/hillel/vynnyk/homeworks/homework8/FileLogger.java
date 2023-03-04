package com.hillel.vynnyk.homeworks.homework8;

import com.hillel.vynnyk.homeworks.homework6.ArrayListMethods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class FileLogger implements Logger {
    private final FileLoggerConfiguration fileLoggerConfiguration;
    private File file;
    private FileWriter fileWriter;

    public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) throws IOException {
        this.fileLoggerConfiguration = fileLoggerConfiguration;
        var outputDir = new File(fileLoggerConfiguration.getPath());
        outputDir.mkdirs();

        var outputFileName = resolveOutputFileNameWithOutStream(outputDir);

        this.file = new File(fileLoggerConfiguration.getPath() + "/" + outputFileName);
        this.fileWriter = new FileWriter(file, true);

    }

    private String resolveOutputFileName(File outputDir) throws IOException {
        return Files.list(outputDir.toPath())
                .map(path -> path.toFile().getName())
                .filter(filename -> filename.startsWith("file"))
                .sorted(Comparator.<String>naturalOrder().reversed())
                .findFirst()
                .orElseGet(this::createFileName);
    }

    private String resolveOutputFileNameWithOutStream(File outputDir) throws IOException {
        var files = ArrayListMethods.toList(outputDir.list());
        files.sort(Comparator.<String>naturalOrder().reversed());
        if (files.size() > 0) {
            return files.get(0);
        }
        return createFileName();
    }

    private void changeOutputFile() throws IOException {
        if (fileWriter != null) {
            fileWriter.close();
        }
        file = new File(fileLoggerConfiguration.getPath() + "/" + createFileName());
        fileWriter = new FileWriter(file, true);
    }

    protected String createFileName() {
        return "file" + LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss"));
    }

    @Override
    public void debug(String message) throws IOException {
        writeMessage(message);
    }

    @Override
    public void info(String message) throws IOException {
        if (fileLoggerConfiguration.getLevel().equals(LoggingLevel.INFO.name)) {
            writeMessage(message);
        }
    }

    private void writeMessage(String message) throws IOException {
        String info = LocalDateTime.now() + " " + fileLoggerConfiguration.getLevel() + " " + message + "\n";
        int maxSize = Integer.parseInt(fileLoggerConfiguration.getMaxSize());
        long size = Files.size(Path.of(file.getPath()));
        if (size > maxSize) {
            changeOutputFile();
        }
        try {
            fileWriter.write(info);
            fileWriter.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }



    public static void main(String[] args) throws IOException {
        FileLoggerConfigurationLoader loader1 = new FileLoggerConfigurationLoader();
        FileLoggerConfiguration config = loader1.load();
        FileLogger fileLogger = new FileLogger(config);
        fileLogger.debug("Debug Message");
        fileLogger.info("Here is info message");
    }

}
