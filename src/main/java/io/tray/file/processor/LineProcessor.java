package io.tray.file.processor;

import io.tray.model.Configuration;

public interface LineProcessor {
    Configuration process(String line, Configuration configuration);
}
