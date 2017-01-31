package com.company.structural.decorator.decorators;

import com.company.structural.decorator.interfaces.Pizza;

public abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }
}
