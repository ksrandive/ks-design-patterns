package com.ks.learning.structural.bridge;

public class PetrolEngine implements IEngine{
    @Override
    public String refill() {
        return "filled with 5 liter";
    }
}
