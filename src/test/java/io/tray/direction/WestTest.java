package io.tray.direction;

import io.tray.model.Coordinates;
import io.tray.model.Robot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WestTest {

    @Test
    public void testMove() throws Exception {
        Robot robot = DirectionTestUtil.testMove(new Coordinates(1, 1),
                new Coordinates(5, 5),
                new West());

        assertEquals(new Coordinates(0, 1), robot.getLocation());
    }

    @Test
    public void testMoveAtEdge() throws Exception {
        Robot robot = DirectionTestUtil.testMove(new Coordinates(0, 3),
                new Coordinates(5, 5),
                new West());

        assertEquals(new Coordinates(0, 3), robot.getLocation());
    }
}
