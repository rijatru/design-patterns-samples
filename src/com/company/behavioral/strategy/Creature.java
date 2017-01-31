package com.company.behavioral.strategy;

public abstract class Creature {

    protected String name;

    protected double weight;

    protected String sound;

    public abstract String getName();

    public abstract void setName(String newName);

    public abstract double getWeight();

    public abstract void setWeight(double weight);

    public abstract String getSound();

    public abstract void setSound(String sound);
}
