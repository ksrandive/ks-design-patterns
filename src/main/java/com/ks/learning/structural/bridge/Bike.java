package com.ks.learning.structural.bridge;

public class Bike extends IVehicle {

    private IEngine iEngine;

    public Bike(IEngine iEngine) {
        super(iEngine);
        this.iEngine = iEngine;
    }

    @Override
    public void refill() {
        System.out.println("Bike : " + iEngine.refill());
    }
}
