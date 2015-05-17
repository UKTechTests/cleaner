package io.tray.file.processor;

import io.tray.model.Configuration;
import io.tray.model.Path;

public class PathProcessor implements LineProcessor {
    @Override
    public Configuration process(String line, Configuration configuration) {
        Path path = new Path(line);
        configuration.setPath(path);

        return configuration;
    }
}
