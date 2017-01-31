package com.company.creational.prototype;

import com.company.creational.prototype.interfaces.Animal;

public class Sheep implements Animal {

    public Sheep() {

        System.out.println("SHeep is made");
    }

    @Override
    public Animal makeCopy() {

        System.out.println("Sheep is being made");

        Sheep sheepObject = null;

        try {
            sheepObject = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sheepObject;
    }

    public String toString() {

        return "Dolly is my hero, Baaaaa";
    }
}
