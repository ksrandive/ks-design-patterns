package com.ks.learning.creational.factory;

public class NonVegPizzaChef implements IPizzaChef{
    @Override
    public IPizza createPizza() {
        return new NonVegPizza();
    }
}
