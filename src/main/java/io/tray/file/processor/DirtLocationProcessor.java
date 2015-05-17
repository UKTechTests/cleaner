package io.tray.file.processor;

import io.tray.model.Configuration;
import io.tray.model.Coordinates;
import io.tray.model.Dirt;

public class DirtLocationProcessor implements LineProcessor {
    @Override
    public Configuration process(String line, Configuration configuration) {
        Dirt dirt = configuration.getDirt();

        if (dirt == null) {
            dirt = new Dirt();
            configuration.setDirt(dirt);
        }

        dirt.addLocation(Coordinates.stringToCoordinates(line));

        return configuration;
    }
}
