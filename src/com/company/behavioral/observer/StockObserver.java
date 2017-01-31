package com.bootleg.oob.observer;

import com.bootleg.oob.observer.interfaces.Observer;
import com.bootleg.oob.observer.interfaces.Subject;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIdTracker = 0;

    private  int observerId;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {

        this.stockGrabber = stockGrabber;

        this.observerId = ++observerIdTracker;

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {

        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;
    }
}
