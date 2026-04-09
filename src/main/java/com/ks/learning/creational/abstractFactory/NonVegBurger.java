package com.ks.learning.creational.abstractFactory;

public class NonVegBurger implements IBurger{
    @Override
    public String eat() {
        return "This is a non veg Burger";
    }
}
