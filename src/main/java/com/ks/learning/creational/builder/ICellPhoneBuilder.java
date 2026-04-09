package com.ks.learning.creational.builder;

public interface ICellPhoneBuilder {
     CellPhone getCellPhone();

     ICellPhoneBuilder setOs(String os);

     ICellPhoneBuilder setProcessor(String processor);

     ICellPhoneBuilder setCamera(int camera);

     ICellPhoneBuilder setBattery(int battery);

}
