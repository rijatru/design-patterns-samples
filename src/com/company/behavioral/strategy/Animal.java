package com.company.behavioral.strategy;

import com.company.behavioral.strategy.interfaces.Flies;

public class Animal extends Creature {

    private String name;
    private String sound;

    protected Flies flyingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingAbility(Flies newFlyType) {
        flyingType = newFlyType;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setWeight(double weight) {

    }
}
