package com.ks.learning.creational.builder;

public class AppleCellPhoneBuilder implements ICellPhoneBuilder {

    private String brand = "Apple";
    private String os;
    private String processor;
    private int camera;
    private int battery;

    public ICellPhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public ICellPhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;

    }

    public ICellPhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;

    }

    public ICellPhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;

    }

    public CellPhone getCellPhone(){
        return new CellPhone(os, processor, camera, battery, brand);
    }
}
