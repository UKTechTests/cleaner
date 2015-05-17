package io.tray.model;

public class Robot {

    private Coordinates location;

    public Robot(Coordinates location) {
        this.location = location;
    }

    public void setLocation(Coordinates location) {
        this.location = location;
    }

    public Coordinates getLocation() {
        return location;
    }
}
