package com.company.behavioral.strategy;

public class Giraffe extends Creature {

    private String name;

    @Override
    public void setName(String newName) {
        name = newName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setWeight(double weight) {

    }

    @Override
    public String getSound() {
        return null;
    }

    @Override
    public void setSound(String sound) {

    }
}
