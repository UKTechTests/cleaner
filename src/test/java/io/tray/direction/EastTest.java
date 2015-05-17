package io.tray.direction;

import io.tray.model.Coordinates;
import io.tray.model.Robot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EastTest {

    @Test
    public void testMove() throws Exception {
        Robot robot = DirectionTestUtil.testMove(new Coordinates(1, 1),
                new Coordinates(5, 5),
                new East());

        assertEquals(new Coordinates(2, 1), robot.getLocation());
    }

    @Test
    public void testMoveAtEdge() throws Exception {
        Robot robot = DirectionTestUtil.testMove(new Coordinates(5, 4),
                new Coordinates(5, 5),
                new East());

        assertEquals(new Coordinates(5, 4), robot.getLocation());
    }
}
