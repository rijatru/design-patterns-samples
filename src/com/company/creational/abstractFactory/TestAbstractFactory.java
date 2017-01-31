package com.company.creational.abstractFactory;

import com.company.creational.abstractFactory.ships.EnemyShipSuper;
import com.company.creational.abstractFactory.stores.EnemyShipStore;
import com.company.creational.abstractFactory.stores.UFOEnemyShipStore;

public class TestAbstractFactory {

    public static void main(String args[]) {

        EnemyShipStore ufoStore = new UFOEnemyShipStore();

        EnemyShipSuper theGrunt = ufoStore.orderTheShip("UFO");

        System.out.println(theGrunt + "\n");

        EnemyShipSuper theBoss = ufoStore.orderTheShip("UFO BOSS");

        System.out.println(theBoss + "\n");
    }
}
