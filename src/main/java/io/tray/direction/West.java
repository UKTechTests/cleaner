package io.tray.direction;

import io.tray.model.Coordinates;
import io.tray.model.Robot;
import io.tray.model.Room;

public class West implements Direction {

    @Override
    public Robot move(Robot robot, Room room) {
        int x = robot.getLocation().getX();
        if (x > 0) {
            x--;
        }
        robot.setLocation(new Coordinates(x, robot.getLocation().getY()));
        return robot;
    }
}