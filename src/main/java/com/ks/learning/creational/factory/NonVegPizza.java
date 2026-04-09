package com.ks.learning.creational.factory;

public class NonVegPizza implements IPizza {
    @Override
    public String eat() {
        return "this is non veg pizza";
    }
}
