package io.tray;

import io.tray.direction.*;
import io.tray.model.*;

import java.util.Set;

public class RobotRunner {

    public static Robot run(Configuration configuration) {
        Robot robot = configuration.getRobot();

        Path path = configuration.getPath();
        Room room = configuration.getRoom();
        Dirt dirt = configuration.getDirt();

        checkForDirtAndRemove(robot, dirt);

        for (String direction : path.getPathQueue()) {

            Direction movement;
            if ("N".equals(direction)) {
                movement = new North();
            }
            else if ("E".equals(direction)) {
                movement = new East();
            }
            else if ("S".equals(direction)) {
                movement = new South();
            }
            else {
                movement = new West();
            }

            movement.move(robot, room);
            checkForDirtAndRemove(robot, dirt);
        }

        return robot;
    }

    private static void checkForDirtAndRemove(Robot robot, Dirt dirt) {
        Coordinates robotLocation = robot.getLocation();

        Set<Coordinates> dirtLocations = dirt.getLocations();

        if (dirtLocations.remove(robotLocation)) {
            robot.incrementDirtRemoval();
        }
    }
}
