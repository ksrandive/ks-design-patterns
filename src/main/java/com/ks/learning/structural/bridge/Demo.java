package com.ks.learning.structural.bridge;

public class Demo {

    public static void main(String[] args) {
        IEngine iEngine = new PetrolEngine();
        IVehicle car = new Car(iEngine);
        car.refill();
    }
}
