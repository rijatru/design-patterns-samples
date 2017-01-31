package com.company.creational.factory;

public class TestFactory {

    public static void main(String args[]) {

        EnemyShip theEnemy = null;

        String enemyShipOption = "";

        if (enemyShipOption.equals("U")) { //TODO Using inheritance

            theEnemy = new UFOEnemyShip();

        } else if (enemyShipOption.equals("R")) {

            theEnemy = new RocketEnemyShip();
        }

        doStuffEnemy(theEnemy);

        EnemyShipFactory shipFactory = new EnemyShipFactory(); //TODO Using factory

        theEnemy = shipFactory.makeEnemyShip("R");

        doStuffEnemy(theEnemy);
    }

    private static void doStuffEnemy(EnemyShip enemyShip) {

        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }
}
