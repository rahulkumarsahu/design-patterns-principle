package com.design.patterns.creational.factory;

public interface Computer {

    String ram();
    String hdd();
    String cpu();

    boolean isGraphicsEnabled();
    boolean isBluetoothEnabled();
}
