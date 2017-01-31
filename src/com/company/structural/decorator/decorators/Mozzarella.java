package com.company.structural.decorator.decorators;

import com.company.structural.decorator.interfaces.Pizza;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ",  Mozzarella";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .50;
    }
}
