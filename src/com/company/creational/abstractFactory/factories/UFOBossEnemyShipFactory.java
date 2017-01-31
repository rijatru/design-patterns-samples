package com.company.creational.abstractFactory.factories;

// This factory uses the EnemyShipSuper interface
// to create very specific UFO Enemy Ship

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine

// The returned object specifies a specific weapon & engine

import com.company.creational.abstractFactory.factories.interfaces.EnemyShipFactory;
import com.company.creational.abstractFactory.ships.parts.engines.EnemyShipUFOBossEngine;
import com.company.creational.abstractFactory.ships.parts.interfaces.EnemyShipEngine;
import com.company.creational.abstractFactory.ships.parts.interfaces.EnemyShipWeapon;
import com.company.creational.abstractFactory.ships.parts.weapons.EnemyShipUFOBossGun;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

    // Defines the weapon object to associate with the ship

    public EnemyShipWeapon addEnemyShipGun() {
        return new EnemyShipUFOBossGun(); // Specific to Boss UFO
    }

    // Defines the engine object to associate with the ship

    public EnemyShipEngine addEnemyShipEngine() {
        return new EnemyShipUFOBossEngine(); // Specific to Boss UFO
    }
}
