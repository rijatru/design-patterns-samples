package com.company.structural.decorator;

import com.company.structural.decorator.interfaces.Pizza;

public class PlainPizza implements Pizza {

    public PlainPizza() {

        System.out.println("Adding Dough");
    }

    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
