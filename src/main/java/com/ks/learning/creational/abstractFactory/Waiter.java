package com.ks.learning.creational.abstractFactory;

public class Waiter {

    private IChef foodFactory;

    public Waiter(String type){
        if(type == "veg"){
            foodFactory = new VegChef();
        }else {
            foodFactory = new NonVegChef();
        }
    }
    public IPizza getPizza(){
        return foodFactory.createPizza();
    }

    public IBurger getBurger(){
        return foodFactory.createBurger();
    }
}

class Demo{
    public static void main(String[] args) {
        Waiter waiter = new Waiter("veg");
        String eat = waiter.getPizza().eat();
        System.out.println(eat);

        String eat1 = waiter.getBurger().eat();
        System.out.println(eat1);
    }
}
