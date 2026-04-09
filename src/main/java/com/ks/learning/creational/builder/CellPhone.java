package com.ks.learning.creational.builder;

public class CellPhone {

    private String brand;
    private String os;
    private String processor;
    private int camera;
    private int battery;

    public CellPhone(String os, String processor, int camera, int battery, String brand) {
        this.os = os;
        this.processor = processor;
        this.camera = camera;
        this.battery = battery;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "brand='" + brand + '\'' +
                ", os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", camera=" + camera +
                ", battery=" + battery +
                '}';
    }
}


class Demo{
    public static void main(String[] args) {
        ICellPhoneBuilder iCellPhoneBuilder = new AppleCellPhoneBuilder();

        CellPhone cellPhone = iCellPhoneBuilder.setOs("mac").setProcessor("mac chip").getCellPhone();
        System.out.println(cellPhone);
    }
}
