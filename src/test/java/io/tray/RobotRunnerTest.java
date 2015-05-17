package io.tray;

import io.tray.model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotRunnerTest {

    private Configuration configuration;
    private Dirt dirt;

    @Before
    public void setUp() throws Exception {
        configuration = new Configuration();
        dirt = new Dirt();
    }

    @Test
    public void testRunFromExample() throws Exception {
        configuration.setRoom(new Room(4, 4));
        configuration.setRobot(new Robot(new Coordinates(1, 2)));

        dirt.addLocation(new Coordinates(1, 0));
        dirt.addLocation(new Coordinates(2, 2));
        dirt.addLocation(new Coordinates(2, 3));

        configuration.setDirt(dirt);
        configuration.setPath(new Path("NNESEESWNWW"));

        Robot robot = RobotRunner.run(configuration);

        assertEquals(new Coordinates(1, 3), robot.getLocation());
        assertEquals(1, robot.getDirtRemovalCount());
    }

    @Test
    public void testRunDirtAtStartLocation() throws Exception {
        configuration.setRoom(new Room(4, 4));
        configuration.setRobot(new Robot(new Coordinates(1, 2)));

        dirt.addLocation(new Coordinates(1, 2));
        dirt.addLocation(new Coordinates(2, 3));
        dirt.addLocation(new Coordinates(3, 3));
        dirt.addLocation(new Coordinates(4, 1));
        dirt.addLocation(new Coordinates(0, 0));

        configuration.setDirt(dirt);
        configuration.setPath(new Path("NNSEENNNESSSW"));

        Robot robot = RobotRunner.run(configuration);

        assertEquals(new Coordinates(3, 1), robot.getLocation());
        assertEquals(4, robot.getDirtRemovalCount());
    }

    @Test
    public void testJustNorth() throws Exception {
        configuration.setRoom(new Room(10, 10));
        configuration.setRobot(new Robot(new Coordinates(0, 0)));

        dirt.addLocation(new Coordinates(0, 1));
        dirt.addLocation(new Coordinates(0, 2));
        dirt.addLocation(new Coordinates(0, 3));

        configuration.setDirt(dirt);
        configuration.setPath(new Path("NNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN"));

        Robot robot = RobotRunner.run(configuration);

        assertEquals(new Coordinates(0, 10), robot.getLocation());
        assertEquals(3, robot.getDirtRemovalCount());
    }

    @Test
    public void testJustEast() throws Exception {
        configuration.setRoom(new Room(10, 10));
        configuration.setRobot(new Robot(new Coordinates(0, 0)));
        configuration.setPath(new Path("EEEEEEEEEEEEEEEEEEEEEEEEEEE"));
        configuration.setDirt(dirt);

        Robot robot = RobotRunner.run(configuration);

        assertEquals(new Coordinates(10, 0), robot.getLocation());
        assertEquals(0, robot.getDirtRemovalCount());
    }
}
