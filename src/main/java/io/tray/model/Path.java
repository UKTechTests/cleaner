package io.tray.model;

import java.util.LinkedList;
import java.util.Queue;

public class Path {

    private Queue<String> path;
    private String inputPath;

    public Path(String path) {
        this.inputPath = path;
        this.path = stringToQueue(path);
    }

    private Queue<String> stringToQueue(String string) {
        Queue<String> queue = new LinkedList<>();
        for (String direction : string.split("")) {
            queue.add(direction);
        }
        return queue;
    }

    public String getPath() {
        return inputPath;
    }

    public Queue<String> getPathQueue() {
        return path;
    }
}
