package io.tray.file.processor;

import io.tray.model.Configuration;
import io.tray.model.Room;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomSizeProcessorTest {

    @Test
    public void testProcess() throws Exception {

        RoomSizeProcessor roomSizeProcessor = new RoomSizeProcessor();

        Configuration config = new Configuration();
        roomSizeProcessor.process("3 3", config);

        Room room = config.getRoom();
        assertEquals(3, room.getX());
        assertEquals(3, room.getY());
    }
}