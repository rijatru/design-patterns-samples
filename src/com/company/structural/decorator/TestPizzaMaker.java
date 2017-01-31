package com.company.structural.decorator;

import com.company.structural.decorator.decorators.Mozzarella;
import com.company.structural.decorator.decorators.TomatoSauce;
import com.company.structural.decorator.interfaces.Pizza;

public class TestPizzaMaker {

    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());
    }
}
