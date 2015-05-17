package io.tray.direction;

import io.tray.model.Coordinates;
import io.tray.model.Robot;
import org.junit.Test;

import static org.junit.Assert.*;

public class SouthTest {

    @Test
    public void testMove() throws Exception {
        Robot robot = DirectionTestUtil.testMove(new Coordinates(1, 1),
                new Coordinates(5, 5),
                new South());

        assertEquals(new Coordinates(1, 0), robot.getLocation());
    }

    @Test
    public void testMoveAtEdge() throws Exception {
        Robot robot = DirectionTestUtil.testMove(new Coordinates(4, 0),
                new Coordinates(5, 5),
                new South());

        assertEquals(new Coordinates(4, 0), robot.getLocation());
    }
}