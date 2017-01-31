package com.company.creational.builder.interfaces;

import com.company.creational.builder.Robot;

public interface RobotBuilder {

    void buildRobotHead();

    void buildRobotTorso();

    void buildRobotArms();

    void buildRobotLegs();

    Robot getRobot();
}
