package com.company.structural.decorator.decorators;

import com.company.structural.decorator.interfaces.Pizza;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Tomato Sauce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ",  Tomato Sauce";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .35;
    }
}
