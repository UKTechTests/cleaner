package io.tray.direction;

import io.tray.model.Coordinates;
import io.tray.model.Robot;
import io.tray.model.Room;

public class South implements Direction {

    @Override
    public Robot move(Robot robot, Room room) {
        int y = robot.getLocation().getY();
        if (y > 0) {
            y--;
        }
        robot.setLocation(new Coordinates(robot.getLocation().getX(), y));
        return robot;
    }
}