package io.tray.file.processor;

import io.tray.model.Configuration;
import io.tray.model.Coordinates;
import io.tray.model.Dirt;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class DirtLocationProcessorTest {

    @Test
    public void testProcess() throws Exception {
        DirtLocationProcessor dirtLocationProcessor = new DirtLocationProcessor();

        Configuration configuration = new Configuration();

        dirtLocationProcessor.process("1 2", configuration);

        Dirt dirt = configuration.getDirt();

        Set<Coordinates> locations = dirt.getLocations();

        Coordinates testDirt = new Coordinates(0, 0);
        for (Coordinates location : locations) {
            testDirt = location;
            break;
        }

        assertEquals(1, testDirt.getX());
        assertEquals(2, testDirt.getY());
    }
}