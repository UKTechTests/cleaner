package io.tray;

import io.tray.file.InputReader;
import io.tray.model.Configuration;
import io.tray.model.Robot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    private final static String INPUT_FILE_NAME = "input.txt";

    public static void main(String[] args) {

        InputReader inputReader = new InputReader();
        Configuration configuration;
        try {
            configuration = inputReader.configureFromFile(Files.lines(Paths.get(INPUT_FILE_NAME)));
        } catch (IOException e) {
            System.out.println("Unable to find input file name: " + INPUT_FILE_NAME);
            return;
        }

        Robot robot = RobotRunner.run(configuration);

        System.out.println(robot.getLocation());
        System.out.println(robot.getDirtRemovalCount());
    }
}
