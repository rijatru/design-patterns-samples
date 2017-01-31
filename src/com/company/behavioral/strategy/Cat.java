package com.company.behavioral.strategy;

public class Cat extends Animal {

    private String sound;

    public Cat() {
        super();

        flyingType = new ItFlies();
    }

    @Override
    public String getSound() {

        return sound;
    }

    @Override
    public void setSound(String sound) {
        this.sound = sound;
    }
}
