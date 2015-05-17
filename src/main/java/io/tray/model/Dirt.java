package io.tray.model;

import java.util.HashSet;
import java.util.Set;

public class Dirt {

    private Set<Coordinates> locations = new HashSet<>();

    public void addLocation(Coordinates location) {
        locations.add(location);
    }

    public Set<Coordinates> getLocations() {
        return locations;
    }
}
