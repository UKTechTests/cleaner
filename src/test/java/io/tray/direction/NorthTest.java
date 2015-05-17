package io.tray.direction;

import io.tray.model.Coordinates;
import io.tray.model.Robot;
import io.tray.model.Room;
import org.junit.Test;

import static org.junit.Assert.*;

public class NorthTest {

    @Test
    public void testMove() throws Exception {
        Robot robot = DirectionTestUtil.testMove(new Coordinates(1, 1),
                new Coordinates(5, 5),
                new North());

        assertEquals(new Coordinates(1, 2), robot.getLocation());
    }

    @Test
    public void testMoveAtEdge() throws Exception {
        Robot robot = DirectionTestUtil.testMove(new Coordinates(4, 5),
                new Coordinates(5, 5),
                new North());

        assertEquals(new Coordinates(4, 5), robot.getLocation());
    }
}
