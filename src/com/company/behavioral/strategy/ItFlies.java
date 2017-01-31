package com.company.behavioral.strategy;

import com.company.behavioral.strategy.interfaces.Flies;

public class ItFlies implements Flies {

    @Override
    public String fly() {
        return "Flying high";
    }
}
