package com.ks.learning.structural.bridge;

public class ElectricEngine implements IEngine{
    @Override
    public String refill() {
        return "charging to 100%";
    }
}
