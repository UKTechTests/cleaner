package io.tray.model;

public class Robot {

    private Coordinates location;
    private int dirtRemovalCount;

    public Robot(Coordinates location) {
        this.location = location;
        this.dirtRemovalCount = 0;
    }

    public void setLocation(Coordinates location) {
        this.location = location;
    }

    public Coordinates getLocation() {
        return location;
    }

    public void incrementDirtRemoval() {
        dirtRemovalCount = dirtRemovalCount + 1;
    }

    public int getDirtRemovalCount() {
        return dirtRemovalCount;
    }
}
