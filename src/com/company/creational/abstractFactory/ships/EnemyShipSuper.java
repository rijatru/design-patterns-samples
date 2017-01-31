package com.company.creational.abstractFactory.ships;

import com.company.creational.abstractFactory.ships.parts.interfaces.EnemyShipEngine;
import com.company.creational.abstractFactory.ships.parts.interfaces.EnemyShipWeapon;

public abstract class EnemyShipSuper {

    private String name;

    // Newly defined objects that represent weapon & engine
    // These can be changed easily by assigning new parts
    // in UFOEnemyShipFactory or UFOBossEnemyShipFactory

    private EnemyShipWeapon weapon;
    private EnemyShipEngine engine;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public EnemyShipWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(EnemyShipWeapon weapon) {
        this.weapon = weapon;
    }

    public EnemyShipEngine getEngine() {
        return engine;
    }

    public void setEngine(EnemyShipEngine engine) {
        this.engine = engine;
    }

    public abstract void makeShip();

    // Because I defined the toString method in engine
    // when it is printed the String defined in toString goes
    // on the screen

    public void followHeroShip() {

        System.out.println(getName() + " is following the hero at " + engine);
    }

    public void displayEnemyShip() {

        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {

        System.out.println(getName() + " attacks and does " + weapon);
    }

    // If any EnemyShipSuper object is printed to screen this shows up

    public String toString() {

        String infoOnShip = "The " + name + " has a top speed of " + engine +
                " and an attack power of " + weapon;

        return infoOnShip;
    }
}
