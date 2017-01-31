package com.company.creational.factory;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType) {

        if (newShipType.equals("U")) {

            return new UFOEnemyShip();

        } else if (newShipType.equals("R")) {

            return new RocketEnemyShip();

        } if (newShipType.equals("B")) {

            return new BigUFOEnemyShip();

        } else {

            return null;
        }
    }
}
