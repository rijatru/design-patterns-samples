package com.company.behavioral.strategy;

import com.company.behavioral.strategy.interfaces.Living;

public class Dog extends Animal implements Living {

    private String sound;

    public Dog() {
        super();

        flyingType = new CantFly();
    }

    @Override
    public String getSound() {

        return sound;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void setSpeed(double speed) {

    }

    @Override
    public void getSpeed() {

    }
}
