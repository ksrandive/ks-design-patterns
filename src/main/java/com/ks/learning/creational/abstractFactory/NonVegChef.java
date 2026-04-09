package com.ks.learning.creational.abstractFactory;

public class NonVegChef implements IChef{
    @Override
    public IPizza createPizza() {
        return new NonVegPizza();
    }

    @Override
    public IBurger createBurger() {
        return new NonVegBurger();
    }
}
