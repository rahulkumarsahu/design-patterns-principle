package com.design.patterns.creational.singleton;

// whenever needed then only create object and once created every time return the same.
// not thread safe.
public class SingletonLazyInitialization {

    private static SingletonLazyInitialization instance = null;

    /*
     * private constructor so that
     * preventing instance creation from other class
     */
    private SingletonLazyInitialization() {

    }

    /**
     * This method has global access to return
     * Single instance within JVM
     * @return Singleton Instance
     */
    public static SingletonLazyInitialization getInstance() {
        //If Instance is null then only instantiate
        if (instance == null) {
            instance = new SingletonLazyInitialization();
        }
        return instance;

    }
}
