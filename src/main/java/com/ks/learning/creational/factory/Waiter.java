package com.ks.learning.creational.factory;

public class Waiter {

    public IPizza getPizza(String type) {
        IPizzaChef chef;

        switch (type) {
            case "veg":
                chef = new VegPizzaChef();
                break;
            default:
                chef = new NonVegPizzaChef();
                break;
        }

        return chef.createPizza();
    }
}

class Demo{
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        IPizza veg = waiter.getPizza("veg");
        System.out.println(veg.eat());

        IPizza veg1 = waiter.getPizza("non veg");
        System.out.println(veg1.eat());
    }
}
