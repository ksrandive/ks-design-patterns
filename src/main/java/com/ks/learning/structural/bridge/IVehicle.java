package com.ks.learning.structural.bridge;

public abstract class IVehicle {

    private IEngine iEngine;
    protected IVehicle(IEngine iEngine){
        this.iEngine = iEngine;
    }

    public abstract void refill();

}
