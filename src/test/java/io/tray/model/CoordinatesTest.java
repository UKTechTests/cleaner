package io.tray.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinatesTest {

    @Test
    public void testStringToCoordinates() throws Exception {
        Coordinates result = Coordinates.stringToCoordinates("1 2");

        assertEquals(1, result.getX());
        assertEquals(2, result.getY());
    }
}
