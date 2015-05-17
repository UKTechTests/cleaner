package io.tray.model;

public class Configuration {

    private Room room;
    private Dirt dirt;
    private Robot robot;
    private Path path;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Dirt getDirt() {
        return dirt;
    }

    public void setDirt(Dirt dirt) {
        this.dirt = dirt;
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }
}
