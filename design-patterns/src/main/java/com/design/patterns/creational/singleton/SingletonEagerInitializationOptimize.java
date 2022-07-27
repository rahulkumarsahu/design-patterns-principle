package com.design.patterns.creational.singleton;

// not thread safe.
public class SingletonEagerInitializationOptimize {

    //Eager initialization
    private static SingletonEagerInitializationOptimize instance = null;

    /*
     * private constructor so that
     * preventing instance creation from other class
     */
    private SingletonEagerInitializationOptimize() {
    }

    //static block for throwing exception
    static {
        try {
            instance = new SingletonEagerInitializationOptimize();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method has global access to return
     * Single instance within JVM
     * @return Singleton Instance
     */
    public static SingletonEagerInitializationOptimize getInstance() {
        return instance;

    }
}
