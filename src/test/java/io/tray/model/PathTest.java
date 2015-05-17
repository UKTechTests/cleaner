package io.tray.model;

import org.junit.Test;

import java.util.Queue;

import static org.junit.Assert.*;

public class PathTest {

    @Test
    public void testGetPathQueue() throws Exception {
        Path path = new Path("NWSW");

        Queue<String> queue = path.getPathQueue();

        assertEquals("N", queue.remove());
        assertEquals("W", queue.remove());
        assertEquals("S", queue.remove());
        assertEquals("W", queue.remove());
    }
}
