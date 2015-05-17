package io.tray.direction;

import io.tray.model.Robot;
import io.tray.model.Room;

public interface Direction {
    Robot move(Robot robot, Room room);
}
