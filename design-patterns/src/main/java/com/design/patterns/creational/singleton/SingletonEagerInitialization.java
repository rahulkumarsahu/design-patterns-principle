package com.design.patterns.creational.singleton;


// in this case instance will be creating at the time of class loading. because of static variable. but here we cannot throw exception.
// not thread safe.
public class SingletonEagerInitialization {

    //Eager initialization
    private static final SingletonEagerInitialization INSTANCE = new SingletonEagerInitialization();

    /*
     * private constructor so that
     * preventing instance creation from other class
     */
    private SingletonEagerInitialization() {
    }

    /**
     * This method has global access to return
     * Single instance within JVM
     * @return Singleton Instance
     */
    public static SingletonEagerInitialization getInstance() {
        return INSTANCE;
    }

}
