package com.company.creational.abstractFactory.stores;

import com.company.creational.abstractFactory.ships.EnemyShipSuper;

public abstract class EnemyShipStore {

    // This acts as an ordering mechanism for creating
    // EnemyShips that have a weapon, engine & name
    // & nothing else

    // The specific parts used for engine & weapon depend
    // upon the String that is passed to this method

    protected abstract EnemyShipSuper makeEnemyShip(String typeOfShip);

    // When called a new EnemyShipSuper is made. The specific parts
    // are based on the String entered. After the ship is made
    // we execute multiple methods in the EnemyShipSuper Object

    public EnemyShipSuper orderTheShip(String typeOfShip) {

        EnemyShipSuper theEnemyShip = makeEnemyShip(typeOfShip);

        theEnemyShip.makeShip();
        theEnemyShip.displayEnemyShip();
        theEnemyShip.followHeroShip();
        theEnemyShip.enemyShipShoots();

        return theEnemyShip;
    }
}
