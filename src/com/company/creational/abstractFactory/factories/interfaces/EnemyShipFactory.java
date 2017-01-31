package com.company.creational.abstractFactory.factories.interfaces;

// With an Abstract Factory Pattern you won't
// just build ships, but also all of the components
// for the ships

// Here is where you define the parts that are required
// if an object wants to be an enemy ship

import com.company.creational.abstractFactory.ships.parts.interfaces.EnemyShipEngine;
import com.company.creational.abstractFactory.ships.parts.interfaces.EnemyShipWeapon;

public interface EnemyShipFactory {

    EnemyShipWeapon addEnemyShipGun();
    EnemyShipEngine addEnemyShipEngine();
}
