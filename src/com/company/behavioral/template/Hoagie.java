package com.company.behavioral.template;

public abstract class Hoagie {

    boolean afterFirstCondiment = false;

    final void makeSandwich() {

        cutBun();

        if (customerWantsMeat()) {
            addMeat();

            afterFirstCondiment = true;
        }

        if (customerWantsCheese()) {

            if (afterFirstCondiment) {
                System.out.println();
            }

            afterFirstCondiment = true;

            addCheese();
        }

        if (customerWantsVegetables()) {

            if (afterFirstCondiment) {
                System.out.println();
            }

            afterFirstCondiment = true;

            addVegetables();
        }

        if (customerWantsCondiments()) {

            if (afterFirstCondiment) {
                System.out.println();
            }

            afterFirstCondiment = true;

            addCondiments();
        }

        wrapTheHoagie();
    }

    private void cutBun() {
        System.out.println("The Hoagie is Cut");
    }

    abstract void addMeat();

    abstract void addCheese();

    abstract void addVegetables();

    abstract void addCondiments();

    boolean customerWantsMeat() { // Hook or Option
        return true;
    }

    boolean customerWantsCheese() { // Hook or Option
        return true;
    }

    boolean customerWantsVegetables() { // Hook or Option
        return true;
    }

    boolean customerWantsCondiments() { // Hook or Option
        return true;
    }

    private void wrapTheHoagie() {
        System.out.println("Wrap the Hoagie");
    }
}
