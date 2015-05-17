package io.tray.model;

import java.util.LinkedList;
import java.util.List;

public class Dirt {

    private List<Coordinates> locations = new LinkedList<>();

    public void addLocation(Coordinates location) {
        locations.add(location);
    }

    public List<Coordinates> getLocations() {
        return locations;
    }
}
