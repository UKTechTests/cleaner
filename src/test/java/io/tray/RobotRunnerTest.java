package io.tray;

import io.tray.model.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotRunnerTest {

    @Test
    public void testRun() throws Exception {

        Configuration configuration = new Configuration();

        configuration.setRoom(new Room(4, 4));
        configuration.setRobot(new Robot(new Coordinates(1, 2)));

        Dirt dirt = new Dirt();
        dirt.addLocation(new Coordinates(1, 0));
        dirt.addLocation(new Coordinates(2, 2));
        dirt.addLocation(new Coordinates(2, 3));

        configuration.setDirt(dirt);
        configuration.setPath(new Path("NNESEESWNWW"));

        Robot robot = RobotRunner.run(configuration);

        assertEquals(new Coordinates(1, 3), robot.getLocation());
        assertEquals(1, robot.getDirtRemovalCount());
    }
}