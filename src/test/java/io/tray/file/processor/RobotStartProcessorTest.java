package io.tray.file.processor;

import io.tray.model.Configuration;
import io.tray.model.Robot;
import io.tray.model.Room;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotStartProcessorTest {

    @Test
    public void testProcess() throws Exception {
        RobotStartProcessor robotStartProcessor = new RobotStartProcessor();

        Configuration config = new Configuration();
        robotStartProcessor.process("1 4", config);

        Robot robot = config.getRobot();
        assertEquals(1, robot.getLocation().getX());
        assertEquals(4, robot.getLocation().getY());
    }
}