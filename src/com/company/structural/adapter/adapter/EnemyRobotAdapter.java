package com.company.structural.adapter.adapter;

import com.company.structural.adapter.EnemyRobot;
import com.company.structural.adapter.interfaces.EnemyAttacker;

public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobot theRobot;

    public EnemyRobotAdapter(EnemyRobot theRobot) {

        this.theRobot = theRobot;
    }

    @Override
    public void fireWeapon() {

        theRobot.smashWithHands();
    }

    @Override
    public void driveForward() {

        theRobot.walkForward();
    }

    @Override
    public void assignDriver(String driverName) {

        theRobot.reactToHuman(driverName);
    }
}
