package com.ks.learning.creational.abstractFactory;

public class NonVegPizza implements IPizza{
    @Override
    public String eat() {
        return "This is a non veg pizza";
    }
}
