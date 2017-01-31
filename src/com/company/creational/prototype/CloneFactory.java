package com.company.creational.prototype;

import com.company.creational.prototype.interfaces.Animal;

public class CloneFactory {

    public Animal getClone(Animal animalSample) {

        return animalSample.makeCopy();
    }
}
