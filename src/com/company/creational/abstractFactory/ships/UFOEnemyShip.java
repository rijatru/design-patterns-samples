package com.company.creational.abstractFactory.ships;

import com.company.creational.abstractFactory.factories.interfaces.EnemyShipFactory;

public class UFOEnemyShip extends EnemyShipSuper {

    // We define the type of ship we want to create
    // by stating we want to use the factory that
    // makes enemy ships

    private EnemyShipFactory shipFactory;

    // The enemy ship required parts list is sent to
    // this method. They state that the enemy ship
    // must have a weapon and engine assigned. That
    // object also states the specific parts needed
    // to make a regular UFO versus a Boss UFO

    public UFOEnemyShip(EnemyShipFactory shipFactory){

        this.shipFactory = shipFactory;
    }

    // EnemyShipStore calls this method to build a
    // specific UFOEnemyShip

    public void makeShip() {

        System.out.println("Making enemy ship " + getName());

        // The specific weapon & engine needed were passed in
        // shipFactory. We are assigning those specific part
        // objects to the UFOEnemyShip here

        setWeapon(shipFactory.addEnemyShipGun());
        setEngine(shipFactory.addEnemyShipEngine());
    }
}
