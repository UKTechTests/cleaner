package io.tray.model;

import java.util.ArrayList;
import java.util.List;

public class Dirt {

    private List<Coordinates> locations = new ArrayList<>();

    public void addLocation(Coordinates location) {
        locations.add(location);
    }

    public List<Coordinates> getLocations() {
        return locations;
    }
}
