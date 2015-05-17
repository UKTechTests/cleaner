package io.tray.direction;


import io.tray.model.Coordinates;
import io.tray.model.Robot;
import io.tray.model.Room;

public class DirectionTestUtil {

    public static Robot testMove (Coordinates robotStart,
                           Coordinates topRight,
                           Direction direction) throws Exception {
        Robot robot = new Robot(robotStart);
        Room room = new Room(topRight.getX(), topRight.getY());

        direction.move(robot, room);

        return robot;
    }
}
