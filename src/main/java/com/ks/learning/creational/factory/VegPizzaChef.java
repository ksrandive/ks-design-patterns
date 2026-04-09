package com.ks.learning.creational.factory;

public class VegPizzaChef implements IPizzaChef{
    @Override
    public IPizza createPizza() {
        return new VegPizza();
    }
}
