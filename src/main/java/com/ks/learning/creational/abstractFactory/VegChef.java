package com.ks.learning.creational.abstractFactory;

public class VegChef implements IChef{
    @Override
    public IPizza createPizza() {
        return new VegPizza();
    }

    @Override
    public IBurger createBurger() {
        return new VegBurger();
    }
}
