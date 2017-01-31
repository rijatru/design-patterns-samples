package com.company.behavioral.strategy;

import com.company.behavioral.strategy.interfaces.Flies;

public class CantFly implements Flies {

    @Override
    public String fly() {
        return "Can't fly";
    }
}
