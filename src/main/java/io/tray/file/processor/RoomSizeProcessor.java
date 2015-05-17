package io.tray.file.processor;

import io.tray.model.Configuration;
import io.tray.model.Coordinates;
import io.tray.model.Room;

public class RoomSizeProcessor implements LineProcessor {

    @Override
    public Configuration process(String line, Configuration configuration) {

        Coordinates topRight = Coordinates.stringToCoordinates(line);

        Room room = new Room(topRight.getX() - 1, topRight.getY() - 1);
        configuration.setRoom(room);

        return configuration;
    }
}
