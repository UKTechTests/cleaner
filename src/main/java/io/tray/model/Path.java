package io.tray.model;

import java.util.Queue;

public class Path {

    // Need to add directions as a queue. Can add a method to do this, test it.
//    private Queue<>
    private String path;

    public Path(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
