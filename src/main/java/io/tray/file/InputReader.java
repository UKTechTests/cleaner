package io.tray.file;


import io.tray.file.processor.*;
import io.tray.model.Configuration;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class InputReader {

    Queue<LineProcessor> processors = new LinkedList<>();
    Configuration configuration = new Configuration();

    public InputReader() {
        addProcessors();
    }

    public Configuration configureFromFile(Stream<String> lines) {
        lines.forEach(line -> handleLine(line, configuration));

        return configuration;
    }

    private void handleLine(String line, Configuration configuration) {
        if (isPathLine(line)) {
            processPathLine(line, configuration);
        } else {
            processFromQueue(line, configuration);
        }
    }

    private void processFromQueue(String line, Configuration configuration) {
        LineProcessor processor = processors.peek();
        processor.process(line, configuration);
        if (!(processor instanceof DirtLocationProcessor)) {
            processors.remove();
        }
    }

    private void processPathLine(String line, Configuration configuration) {
        LineProcessor pathProcessor = new PathProcessor();
        pathProcessor.process(line, configuration);
    }

    private boolean isPathLine(String line) {
        return line.split(" ").length < 2;
    }

    private void addProcessors() {
        processors.add(new RoomSizeProcessor());
        processors.add(new RobotStartProcessor());
        processors.add(new DirtLocationProcessor());
    }

}
