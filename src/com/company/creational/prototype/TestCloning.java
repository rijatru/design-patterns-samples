package com.company.creational.prototype;

public class TestCloning {

    public static void main(String[] args) {

        CloneFactory animalMaker = new CloneFactory();

        Sheep sally = new Sheep();

        Sheep cloneSheep = (Sheep) animalMaker.getClone(sally);

        System.out.println(sally);

        System.out.println(cloneSheep);

        System.out.println("Sally Hashcode: " + System.identityHashCode(sally));

        System.out.println("Clone Hashcode: " + System.identityHashCode(cloneSheep));
    }
}
