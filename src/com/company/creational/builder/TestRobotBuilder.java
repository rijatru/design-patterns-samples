package com.company.creational.builder;

import com.company.creational.builder.interfaces.RobotBuilder;

public class TestRobotBuilder {

    public static void main(String[] args) {

        RobotBuilder oldStyleRobot = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot); // TODO Passing specification

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println("Robot Built");

        System.out.println("Robot Head type: " + firstRobot.getRobotHead());
    }
}
