package io.tray.file;

import io.tray.model.Configuration;
import io.tray.model.Coordinates;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class InputReaderTest {

    @Test
    public void testConfigureFromFile() throws Exception {

        String[] inputFile = {
                "5 5", // Room size
                "1 2", // Hoover start position
                "1 0", // Dirt
                "2 2", // Dirt
                "2 3", // Dirt
                "NNESEESWNWW" // Hoover path
        };

        InputReader inputReader = new InputReader();
        Configuration config = inputReader.configureFromFile(Arrays.stream(inputFile));

        assertEquals(4, config.getRoom().getX());
        assertEquals(4, config.getRoom().getY());

        assertEquals(new Coordinates(1, 2), config.getRobot().getLocation());

        List<Coordinates> dirtLocations = config.getDirt().getLocations();
        assertEquals(3, dirtLocations.size());

        assertTrue(dirtLocations.contains(new Coordinates(1, 0)));
        assertTrue(dirtLocations.contains(new Coordinates(2, 2)));
        assertTrue(dirtLocations.contains(new Coordinates(2, 3)));

        assertEquals("NNESEESWNWW", config.getPath().getPath());
    }

}