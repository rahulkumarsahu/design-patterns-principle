package com.design.patterns.creational.factory;

import com.design.patterns.creational.factory.impl.Laptop;
import com.design.patterns.creational.factory.impl.PC;
import com.design.patterns.creational.factory.impl.Server;

public class ComputerFactory {

    private ComputerFactory() {
    }

    public static Computer getComputer(ComputerType computerType, String ram, String hdd, String cpu,
                                       boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
        return switch (computerType) {
            case PC -> new PC(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
            case SERVER -> new Server(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
            case LAPTOP -> new Laptop(ram, hdd, cpu, isGraphicsEnabled, isBluetoothEnabled);
        };
    }
}
