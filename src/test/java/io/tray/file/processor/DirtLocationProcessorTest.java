package io.tray.file.processor;

import io.tray.model.Configuration;
import io.tray.model.Coordinates;
import io.tray.model.Dirt;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DirtLocationProcessorTest {

    @Test
    public void testProcess() throws Exception {
        DirtLocationProcessor dirtLocationProcessor = new DirtLocationProcessor();

        Configuration configuration = new Configuration();

        dirtLocationProcessor.process("1 2", configuration);

        Dirt dirt = configuration.getDirt();

        List<Coordinates> locations = dirt.getLocations();
        Coordinates testDirt = locations.get(0);

        assertEquals(1, testDirt.getX());
        assertEquals(2, testDirt.getY());
    }
}