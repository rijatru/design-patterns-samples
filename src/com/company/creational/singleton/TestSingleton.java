package com.company.creational.singleton;

import com.company.creational.objectsReference.Dog;

import java.util.LinkedList;

public class TestSingleton {

    public static void main(String[] args) {

        doDog();

        //doScrabble();
    }

    private static void doScrabble() {

        Singleton newInstance = Singleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(newInstance));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playeOneTiles = newInstance.getTiles(7);

        System.out.println("Player 1: " + playeOneTiles);

        System.out.println(newInstance.getLetterList());

        Singleton instanceTwo = Singleton.getInstance();

        System.out.println("Instance 2 ID: " + System.identityHashCode(instanceTwo));

        System.out.println(newInstance.getLetterList());

        LinkedList<String> playerTwoTiles = newInstance.getTiles(7);

        System.out.println("Player 2: " + playerTwoTiles);
    }

    private static void doDog() {

        Dog doggie = new Dog();

        System.out.println("Dog Name 1: " + doggie.name);

        changeName(doggie);

        System.out.println("Dog Name 1: " + doggie.name);

        Dog doggie2 = doggie;

        changeName(doggie2);

        System.out.println("Dog Name 1: " + doggie.name);

        System.out.println("Dog Name 2: " + doggie.name);
    }

    public static void changeName(Dog doggie) {

        doggie.name = "fiddo";
    }
}
