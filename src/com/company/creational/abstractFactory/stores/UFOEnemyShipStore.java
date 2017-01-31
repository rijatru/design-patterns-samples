package com.company.creational.abstractFactory.stores;

// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build


import com.company.creational.abstractFactory.factories.UFOBossEnemyShipFactory;
import com.company.creational.abstractFactory.factories.UFOEnemyShipFactory;
import com.company.creational.abstractFactory.factories.interfaces.EnemyShipFactory;
import com.company.creational.abstractFactory.ships.EnemyShipSuper;
import com.company.creational.abstractFactory.ships.UFOBossEnemyShip;
import com.company.creational.abstractFactory.ships.UFOEnemyShip;

public class UFOEnemyShipStore extends EnemyShipStore {

    protected EnemyShipSuper makeEnemyShip(String typeOfShip) {

        EnemyShipSuper theEnemyShip = null;

        // If UFO was sent grab use the factory that knows
        // what types of weapons and engines a regular UFO
        // needs. The EnemyShipSuper object is returned & given a name

        // If UFO BOSS was sent grab use the factory that knows
        // what types of weapons and engines a Boss UFO
        // needs. The EnemyShipSuper object is returned & given a name

        if (typeOfShip.equals("UFO")) {

            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory); //TODO This attaches the factory (blueprint) to the to be built UFO
            theEnemyShip.setName("UFO Grunt Ship");

        } else if (typeOfShip.equals("UFO BOSS")) {

            EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
            theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Boss Ship");
        }

        return theEnemyShip;
    }
}
