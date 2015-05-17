package io.tray.file.processor;

import io.tray.model.Configuration;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PathProcessorTest {

    @Test
    public void testProcess() throws Exception {
        PathProcessor pathProcessor = new PathProcessor();

        Configuration configuration = new Configuration();

        String path = "NNSSWWWWWN";
        pathProcessor.process(path, configuration);

        assertEquals(path, configuration.getPath().getPath());
    }
}