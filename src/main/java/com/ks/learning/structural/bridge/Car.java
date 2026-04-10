package com.ks.learning.structural.bridge;

public class Car extends IVehicle {

    private IEngine iEngine;
    public Car(IEngine iEngine) {
        super(iEngine);
        this.iEngine = iEngine;
    }

    @Override
    public void refill() {
        System.out.println("car: " + iEngine.refill());
    }
}
