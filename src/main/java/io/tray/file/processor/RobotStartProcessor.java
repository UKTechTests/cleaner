package io.tray.file.processor;

import io.tray.model.Configuration;
import io.tray.model.Coordinates;
import io.tray.model.Robot;

public class RobotStartProcessor implements LineProcessor {

    @Override
    public Configuration process(String line, Configuration configuration) {
        Robot robot = new Robot(Coordinates.stringToCoordinates(line));
        configuration.setRobot(robot);

        return configuration;
    }
}
