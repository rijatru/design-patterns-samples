package com.company.behavioral.strategy;

public class TestStrategy {

    public static void main(String args[]) {

        Animal dog = new Dog();

       System.out.println("Doggie " + dog.tryToFly());

        dog.setFlyingAbility(new ItFlies());

        System.out.println("Doggie " + dog.tryToFly());

        Giraffe giraffe = new Giraffe();

        giraffe.setName("Frank");

        System.out.println("Giraffe " + giraffe.getName());
    }
}
